//Wael Haidar
//hw04:Month 9/19/14 07:50 pm
//CSE2 Section 112 CRN 48811

//This program prompts the user to enter an integer for the month
//(1 for January, 2 for February, etc.)  and then displays the number
//of days in the month).  If the number 2 is entered (February) the user
//is then asked to enter the year.

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class Month{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;//declare an instance of the scanner object
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter an int giving the number of the month (1-12): ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())//check if the user inputed an int
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int Month = myScanner.nextInt();//accept the user's input and stores it as an int
                if(Month <1 || Month >12)//sets the range of the accepted inputs
                    {System.out.println("You did not enter an int between 1 and 12");
                    return;//leave the program
                    }
                if (Month==2)//when the user chooses Feb as the month the program asks for
                //the year so to know the number of days 
                    {System.out.print("Enter an int giving the year:");
                    Scanner myScanner2;//declare an instance of the scanner object
   			        myScanner2 = new Scanner( System.in );//call the Scanner constructor
                    int year = myScanner2.nextInt();//declare the int variable year and allow the user to input
                    if (year%4 == 0)//checks if the year is a multiple of 4
                        {System.out.println("The month has 29 days");}//if the year is multiple of 4 there will be 29 days in Feb
                    else {System.out.println("The month has 28 days");}//if the year is not a multiple of 4 there will be 28 days in Feb
                    }
                //The following check what is the input of the user and prints the number of days accordingly
                if (Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12)
                    {System.out.println("The month has 31 days");}
                if (Month==4||Month==6||Month==9||Month==11)
                    {System.out.println("The month has 30 days");}
   		    }}
                    
