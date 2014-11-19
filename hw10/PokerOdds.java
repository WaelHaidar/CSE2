//Wael Haidar
//hw10:HW08 11/15/14 7:38 pm
//CSE2 Section 112 CRN 48811

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }
    public static void showHands() {
        String answer = "";
        Scanner scan = new Scanner(System.in);
        do {
            Random Number = new Random(); // Keep this stored as a field
            String[] suits = {
                "Spades", "Clubs", "Hearts", "Diamonds"
            };
            String[] values = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
            };
            int[] fullCards = new int[52];
            for (int c = 0; c < fullCards.length; c++) {
                fullCards[c] = c;
            }
            int[] hand = {
                -1, -1, -1, -1, -1
            };
            for (int change = 0; change < 5; change++) {
                int card = (int)(((fullCards.length) - change) * Math.random());
                hand[change] = fullCards[card];
                for (int m = card; m < 51 - change; m++) {
                    fullCards[m] = fullCards[m + 1];
                }
                fullCards[51 - change] = -1;
            }
            for (int u = 0; u < suits.length; u++) {
                System.out.print(suits[u] + ": ");
                for (int nhand = 0; nhand < 5; nhand++) {
                    if (hand[nhand] / 13 == u) {
                        System.out.print(values[(hand[nhand] % 13)] + " ");
                    }
                }
                System.out.println("");
            }
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        }
        while (answer.equals("Y") || answer.equals("y"));
    }
    public static void simulateOdds() {
        System.out.println("");
        String[] cards = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };
        //int L=0;
        // int [] number= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int noPair = 0;
        int nAce = 0, nQueen = 0, nKing = 0, nJack = 0, nTwo = 0, nThree = 0, nFour = 0, nFive = 0, nSix = 0,
            nSeven = 0, nEight = 0, nNine = 0, nTen = 0;
        String[] hand = new String[5];
        //int[] result= {0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 10000; i++) {
            for (int x = 0; x < 5; x++) {
                String y = (cards[new Random().nextInt(cards.length)]);
                hand[x] = y;
            }
            /*for (int n = 0; n < hand.length; n++) {
                System.out.print(hand[n]); 
                System.out.println ("");
            }*/
            int a = 0;
            for (int w = 0; w < hand.length; w++) {
                for (int e = w + 1; e < hand.length; e++) {
                    if (hand[w] == hand[e]) {
                        a++;
                    }
                }
            }
            if (a == 1) {
                for (int z = 0; z < hand.length; z++) {
                    for (int j = z + 1; j < hand.length; j++) {
                        /*System.out.println (hand [j] + " " + hand [z] );*/
                        if (hand[j] == hand[z]) {
                            
                            // L = hand[z]%13;
                            /*result[L]+=1;
                            if(hand[j]== "A") nAce++;
                            if(hand[j]== "K") nKing++;
                            if(hand[j]== "Q") nQueen++;
                            if(hand[j]== "J") nJack++;
                            if(hand[j]== "2") nTwo++;
                            if(hand[j]== "3") nThree++;
                            if(hand[j]== "4") nFour++;
                            if(hand[j]== "5") nFive++;
                            if(hand[j]== "6") nSix++;
                            if(hand[j]== "7") nSeven++;
                            if(hand[j]== "8") nEight++;
                            if(hand[j]== "9") nNine++;
                            if(hand[j]== "10") nTen++;*/
                            
                            switch (hand[j]) {
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
            else {
                noPair++;

            }
            /* hand[0]=null;
             hand[1]=null;
             hand[2]=null;
             hand[3]=null;
             hand[4]=null;*/
            a = 0;
        }
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
