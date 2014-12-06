//Wael Haidar
//hw11:PokerHands 12/1/14 6:52 pm
//CSE2 Section 112 CRN 48811

import java.util.*; //allow the use of the scanner utility from the library 
public class PokerHands {
    public static void main(String[] args) {
        int check = 0; //declare and initaite the int variable 
        Scanner myScanner; //declare an instance of the scanner object
        myScanner = new Scanner(System.in); //call the Scanner constructor
        String face[] = { //initiate and declare the variables in the string array
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
            "4", "3", "2"
        };
        String suit[] = { //initiate and declare the variables in the string array
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        List < String > List = Arrays.asList(face);
        int[] hand = new int[5]; //initiate and declare the number of variables in the int array
        boolean test = true; //declare and initaite the boolean variable 
        while (test) {
            System.out.println("Enter 'y' or 'Y' to enter a(nother) hand or anything else to excape: "); //prints the prompt for the user
            String answer = myScanner.next(); //register the user's answer
            if (!answer.equals("Y") && !answer.equals("y")) { //checks the answer of the user to the prompt of repitition
                test = false;
                hand = new int[0]; //initiate and declare the number of variables in the int array
                break;
            }
            String[] suits = new String[5]; //initiate and declare the number of variables in the string array
            for (int i = 0; i < 5; i++) { //collect the input from the user and checks its values 
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's': ");
                String suit1 = myScanner.next();
                //the following checks if the input is acceptable 
                if (!(suit1.equals("c") || suit1.equals("d") || suit1.equals("h") || suit1.equals("s"))) {
                    System.out.println("You did not enter a valid response");
                    continue;
                }
                System.out.println("Enter one of 'A', 'K', 'Q', 'J', '10', ...'2': ");
                String card = myScanner.next();
                if (List.contains(card)) { //checks if the input is acceptable and from the list 
                    if (suit1.equals("c")) {
                        suits[i] = "c"; //fill the ith variable of the array 
                        switch (card) { //this switch statements check what kind of card is duplicated 
                            case "A": //these cases fill the ith term of the hand variable according to the user's input
                                hand[i] = 0;
                                break;
                            case "K":
                                hand[i] = 1;
                                break;
                            case "Q":
                                hand[i] = 2;
                                break;
                            case "J":
                                hand[i] = 3;
                                break;
                            case "10":
                                hand[i] = 4;
                                break;
                            case "9":
                                hand[i] = 5;
                                break;
                            case "8":
                                hand[i] = 6;
                                break;
                            case "7":
                                hand[i] = 7;
                                break;
                            case "6":
                                hand[i] = 8;
                                break;
                            case "5":
                                hand[i] = 9;
                                break;
                            case "4":
                                hand[i] = 10;
                                break;
                            case "3":
                                hand[i] = 11;
                                break;
                            case "2":
                                hand[i] = 12;
                                break;
                        }
                    }
                    if (suit1.equals("d")) {
                        suits[i] = "d";
                        switch (card) { //this switch statements check what kind of card is duplicated 
                            //and adds one to the correct kind
                            case "A": //these cases fill the ith term of the hand variable according to the user's input
                                hand[i] = 13;
                                break;
                            case "K":
                                hand[i] = 14;
                                break;
                            case "Q":
                                hand[i] = 15;
                                break;
                            case "J":
                                hand[i] = 16;
                                break;
                            case "10":
                                hand[i] = 17;
                                break;
                            case "9":
                                hand[i] = 18;
                                break;
                            case "8":
                                hand[i] = 19;
                                break;
                            case "7":
                                hand[i] = 20;
                                break;
                            case "6":
                                hand[i] = 21;
                                break;
                            case "5":
                                hand[i] = 22;
                                break;
                            case "4":
                                hand[i] = 23;
                                break;
                            case "3":
                                hand[i] = 24;
                                break;
                            case "2":
                                hand[i] = 25;
                                break;
                        }
                    }
                    if (suit1.equals("h")) {
                        suits[i] = "h";
                        switch (card) { //this switch statements check what kind of card is duplicated 
                            //and adds one to the correct kind
                            case "A": //these cases fill the ith term of the hand variable according to the user's input
                                hand[i] = 26;
                                break;
                            case "K":
                                hand[i] = 27;
                                break;
                            case "Q":
                                hand[i] = 28;
                                break;
                            case "J":
                                hand[i] = 29;
                                break;
                            case "10":
                                hand[i] = 30;
                                break;
                            case "9":
                                hand[i] = 31;
                                break;
                            case "8":
                                hand[i] = 32;
                                break;
                            case "7":
                                hand[i] = 33;
                                break;
                            case "6":
                                hand[i] = 34;
                                break;
                            case "5":
                                hand[i] = 35;
                                break;
                            case "4":
                                hand[i] = 36;
                                break;
                            case "3":
                                hand[i] = 37;
                                break;
                            case "2":
                                hand[i] = 38;
                                break;
                        }
                    }
                    if (suit1.equals("s")) {
                        suits[i] = "s";
                        switch (card) { //this switch statements check what kind of card is duplicated 
                            //and adds one to the correct kind
                            case "A": //these cases fill the ith term of the hand variable according to the user's input
                                hand[i] = 39;
                                break;
                            case "K":
                                hand[i] = 40;
                                break;
                            case "Q":
                                hand[i] = 41;
                                break;
                            case "J":
                                hand[i] = 42;
                                break;
                            case "10":
                                hand[i] = 43;
                                break;
                            case "9":
                                hand[i] = 44;
                                break;
                            case "8":
                                hand[i] = 45;
                                break;
                            case "7":
                                hand[i] = 46;
                                break;
                            case "6":
                                hand[i] = 47;
                                break;
                            case "5":
                                hand[i] = 48;
                                break;
                            case "4":
                                hand[i] = 49;
                                break;
                            case "3":
                                hand[i] = 50;
                                break;
                            case "2":
                                hand[i] = 51;
                                break;
                        }
                    }
                }
                else { //prints out an error message for the user
                    System.out.println("You did not enter a valid response");
                    continue;
                }

            }
            if (!(hand.length == 0)) {
                showOneHand(hand); //calls the method showOneHand
            }

            int[] hand2 = new int[5]; //initiate and declare the number of variables in the int array
            for (int z = 0; z < hand.length; z++) {
                hand2[z] = ((hand[z]) % 13);
            }

            int duplicates = 0; //declare and initaite the int variable 
            for (int w = 0; w < hand2.length; w++) {
                for (int x = w + 1; x < hand2.length; x++) {
                    if (hand2[w] == hand2[x]) { //check if dupliactes exist 
                        duplicates++;
                    }
                }
            }
            switch (duplicates) { //check the nature of the hand based on duplicates and prints accordingly
                case 1:
                    System.out.println("This is a pair");
                    break;
                case 2:
                    System.out.println("This is two pairs ");
                    break;
                case 3:
                    System.out.println("This is three of a kind ");
                    break;
                case 4:
                    System.out.println("This is a full house ");
                    break;
                case 6:
                    System.out.println("This is four of a kind ");
                    break;
            }
            //the following sort the arrays hand and hand2
            Arrays.sort(hand);
            Arrays.sort(hand2);
            boolean checking = true; //declare and initaite the boolean variable 
            for (int n = 0; n < hand.length; n++) { //the following checks for a straight flush hand 
                for (int m = n + 1; m < hand.length; m++) {
                    if (hand[n] + 1 == hand[m]) {
                        checking = true;
                    }
                    else {
                        checking = false;
                    }
                }
            }
            boolean checking2 = true; //declare and initaite the boolean variable 
            for (int n = 0; n < hand2.length; n++) {
                for (int m = n + 1; m < hand2.length; m++) {
                    if (hand2[n] + 1 == hand2[m]) {
                        checking2 = true;
                    }
                    else {
                        checking2 = false;
                    }
                }
            }
            boolean flush = true; //declare and initaite the boolean variable 
            for (int d = 0; d < suits.length; d++) {
                for (int e = d + 1; e < suits.length; e++) {
                    if (suits[d].equals(suits[e])) {
                        flush = true;
                    }
                    else {
                        flush = false;
                    }
                }
            }
            if (checking == true & checking2 == true) { //checks the nature of tha hand and prints accordingly
                System.out.println("This is a straight flush");
            }
            else if (checking2 == true) {
                System.out.println("This is a straight ");
            }
            else if (checking == true & checking2 == true & flush == true) {
                System.out.println("This is a royal flush ");
            }
            else if (flush == true) {
                System.out.println("This is a flush ");
            }


        }
    }
    public static void showOneHand(int hand[]) { //start of the method
        String suit[] = { //initiate and declare the variables in the string array
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = { //initiate and declare the variables in the string array
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = ""; //declare and initaite the string variable 
        for (int s = 0; s < 4; s++) { //the following change the inputed array into an
            //int array with variables between 0 and 51 inclusive 
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < hand.length; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out); //prints out the output of the mathos 
    }
}