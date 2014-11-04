//Wael Haidar
//hw09: BlockedAgain 11/3/14 06:16 pm
//CSE2 Section 112 CRN 48811

// The program forces the user to enter an integer between 1 and 9, inclusive, and then prints
//out displays that depend on the value entered 

import java.util.Scanner;//imports the scanner utility from the java library 
public class BlockedAgain {
    public static int checkInt(Scanner scan) {
        scan = new Scanner(System.in); //call the Scanner constructor
        if (!scan.hasNextInt()) //check if the user inputed an int
        {
            System.out.print("You did not enter an int, try again: ");//prints out an error message 
            int x = checkInt(scan); //calls the method input
            return x;//restart the checkInt method
        }
        else {
            int Number = scan.nextInt();//stores the input from the user in an int 
            return Number;//return the value of the Number 
        }
    }
    public static int checkRange(int m) {
        while (true) {//a loop that will keep repeating itself if it is true 
            if (m < 1 || m > 9) //sets the range of the accepted inputs
            {
                System.out.print("You did not enter an int in [1,9], try again: ");
                m = 0;//reset the value to a zero 
                Scanner newScanner;//construct a new scanner 
                newScanner = new Scanner(System.in);
                m = checkInt(newScanner);//calls the checkInt method 
                continue;//start the loop again
            }
            else {return m;//return the int m if in the correct range 
            }
        }
    }
    public static int getInt() {
        Scanner newScan;//construct a scanner variable 
        newScan = new Scanner(System.in);//accept the user's input
        System.out.print("Enter an integer between (1-9) inclusive: ");//prints out the prompt 
        //print the command for the user to respond to with the required input
        int w = checkInt(newScan);//calls the method checkInt
        int m = checkRange(w);//calls the method checkRange 
        return m;//return the int variable
    }
    public static void block(int Number) {
        int Base=1, Line=1, count=1, Spaces=8;//assign and initiate the variables
        while (Base <= Number) { //Prints out the method that will be used 
            Line = 1; //rest the line number to 1
            while (Line <= Base) { //Start the loop that will count the lines 
                Spaces = 8; //sets the variable 
                while (Spaces >= Base) { //sets the condition for the loop
                    System.out.print(" "); //prints out a space 
                    Spaces--;
                } //decrease the number of spaces by 1

                count = 1; //reset the count to 1
                while (count <= ((Base * 2) - 1)) { // Start the loop that will set the number of times the base is printed
                    System.out.print(Base); //prints the base
                    count++; //increment the count 
                }
                System.out.println(); //leave a line free
                Line++; //increment the line number 
            }
            line(Base);//calls the method line 
            Base++; //increment the Base 
        }
    }
    public static void line(int Base) {
        int nDashes=1, Spaces=8;//assign and initiate the variables
        while (Spaces >= Base) { //sets the condition for the loop
                System.out.print(" "); //prints out a space 
                Spaces--;
            } //decrease the number of spaces by 1 
            nDashes = 1; //resert the nDashes variable to 1
            while (nDashes <= ((Base * 2) - 1)) { //start the loop that sets the number of dashes 
                System.out.print("-"); //prints out the dashes 
                nDashes++; //increment the nDashes 
            }
            System.out.println(); //leave a line free
            
        }

    public static void allBlocks(int Number) {
        block (Number);//calls the method block 
    }

    public static void main(String[] s) {
        int m;//initaite the int variable m 
        //force user to enter int in range 1-9, inclusive.
        m = getInt();//calls the method getInt
        allBlocks(m);//calls the method allBloacks
    }
}
