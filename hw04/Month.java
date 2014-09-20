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
   		        Scanner myScanner;
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter an int giving the number of the month (1-12): ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int Month = myScanner.nextInt();//accept the user's input and stores it as an int
                if(Month <1 || Month >12)
                    {System.out.println("You did not enter an int between 1 and 12");
                    return;
                    }
                if (Month==2)
                    {System.out.print("Enter an int giving the year:");
                    Scanner myScanner2;
   			        myScanner2 = new Scanner( System.in );
                    int year = myScanner2.nextInt();
                    if (year%4 == 0)
                        {System.out.println("The month has 29 days");}
                    else {System.out.println("The month has 28 days");}
                    }
                if (Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12)
                    {System.out.println("The month has 31 days");}
                if (Month==4||Month==6||Month==9||Month==11)
                    {System.out.println("The month has 30 days");}
   		    }}
                    
