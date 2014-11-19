//Wael Haidar
//hw10:HW08 11/15/14 7:38 pm
//CSE2 Section 112 CRN 48811

//In the program the method showOneHand() should generate random poker hands, prompting the user
//if they would like another hand to be generated (it will repeat as long the
//user desires). The method simulateOdds() should randomly generate 10000 hands
//and count the number of times that a hand with a pair of a specific rank occurs,
//along with the number of hands that do not have a pair

import java.util.Random; //calls the utilities from the library
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands(); //calls the method showHands
        simulateOdds(); //calls the method simulateOdds
    }
    public static void showHands() {
        String answer = ""; //initiate the string variable answer
        Scanner scan = new Scanner(System.in);
        do {
            Random Number = new Random(); // Keep this stored as a field
            String[] suits = { //initiate the string array
                "Spades", "Clubs", "Hearts", "Diamonds"
            };
            String[] values = { //initiate the string array
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
            };
            int[] fullCards = new int[52]; //gives a place in memory for the int array 
            for (int c = 0; c < fullCards.length; c++) {
                fullCards[c] = c; //construct the values of the array fullCards
            }
            int[] hand = { //initiate the int array hand 
                -1, -1, -1, -1, -1
            };
            for (int change = 0; change < 5; change++) { //switch each randomly chosen value from
                //the array fullCards with a value from the array hand
                int card = (int)(((fullCards.length) - change) * Math.random()); //randomly choosing a location in tha array
                hand[change] = fullCards[card]; //assign the value 
                for (int m = card; m < 51 - change; m++) {
                    fullCards[m] = fullCards[m + 1];
                }
                fullCards[51 - change] = -1; //switch the used value to -1
            }
            for (int u = 0; u < suits.length; u++) { //the following uses the random number that we obtained
                //and change it to the value from the value array 
                System.out.print(suits[u] + ": ");
                for (int nhand = 0; nhand < 5; nhand++) {
                    if (hand[nhand] / 13 == u) {
                        System.out.print(values[(hand[nhand] % 13)] + " ");
                    }
                }
                System.out.println("");
            }
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //prompts the user to reply
            answer = scan.next(); //register the user's answer 
        }
        while (answer.equals("Y") || answer.equals("y")); //repeats the do statements if the answer is Y or y
    }
    public static void simulateOdds() {
        System.out.println("");
        String[] cards = { //initaite the string array cards 
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };
        //the following initiate int variables to be used later 
        int noPair = 0;
        int nAce = 0, nQueen = 0, nKing = 0, nJack = 0, nTwo = 0, nThree = 0, nFour = 0, nFive = 0, nSix = 0,
            nSeven = 0, nEight = 0, nNine = 0, nTen = 0;
        String[] hand = new String[5]; //assign a memory size for the array hand 
        for (int i = 0; i < 10000; i++) { //allow the repitition 10000 times 
            for (int x = 0; x < 5; x++) { //construct the pocker hand with random choosing from the array
                String y = (cards[new Random().nextInt(cards.length)]);
                hand[x] = y; //assign each value in the array
            }
            int a = 0; //the following checks for duplicates in the hand and adds one to "a" if a duplicate is found
            for (int w = 0; w < hand.length; w++) {
                for (int e = w + 1; e < hand.length; e++) {
                    if (hand[w] == hand[e]) {
                        a++;
                    }
                }
            }
            if (a == 1) { //if the number of duplicates is one the following code runs 
                for (int z = 0; z < hand.length; z++) { //this looks for the duplicate cards
                    for (int j = z + 1; j < hand.length; j++) {
                        if (hand[j] == hand[z]) {

                            switch (hand[j]) { //this switch statements check what kind of card is duplicated 
                                //and adds one to the correct kind
                                case "A":
                                    nAce++;
                                    break;
                                case "K":
                                    nKing++;
                                    break;
                                case "Q":
                                    nQueen++;
                                    break;
                                case "J":
                                    nJack++;
                                    break;
                                case "2":
                                    nTwo++;
                                    break;
                                case "3":
                                    nThree++;
                                    break;
                                case "4":
                                    nFour++;
                                    break;
                                case "5":
                                    nFive++;
                                    break;
                                case "6":
                                    nSix++;
                                    break;
                                case "7":
                                    nSeven++;
                                    break;
                                case "8":
                                    nEight++;
                                    break;
                                case "9":
                                    nNine++;
                                    break;
                                case "10":
                                    nTen++;
                                    break;
                            }

                        }
                    }

                }
            }
            else { //if the number of duplicates is more than one it adds one to the noPair variable 
                noPair++;

            }
            a = 0;
        }
        //the following prints out the results 
        System.out.println("Rank   Freq of exactly one pair");
        System.out.println(" A       " + nAce);
        System.out.println(" K       " + nKing);
        System.out.println(" Q       " + nQueen);
        System.out.println(" J       " + nJack);
        System.out.println(" 10      " + nTen);
        System.out.println(" 9       " + nNine);
        System.out.println(" 8       " + nEight);
        System.out.println(" 7       " + nSeven);
        System.out.println(" 6       " + nSix);
        System.out.println(" 5       " + nFive);
        System.out.println(" 4       " + nFour);
        System.out.println(" 3       " + nThree);
        System.out.println(" 2       " + nTwo);
        System.out.println("---------------------");
        System.out.println("The number of hands with no pair: " + noPair);

    }
}
