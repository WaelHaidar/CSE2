//Wael Haidar
//hw04:TimePadding 9/19/14 8:35 pm 
//CSE2 Section 112 CRN 48811

//This program has the user enter an positive integer giving the number
//of seconds that have passed during the day and then displays the time 
//in conventional form.

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class TimePadding{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter the time in seconds: ");
   			    //print the command for the user to respond to with the required input
                if(!myScanner.hasNextInt())
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int TimeInSec = myScanner.nextInt();//accept the user's input and stores it as an int
   			    if(TimeInSec<0)
                    {System.out.println("You did not enter a positive int");
                    return;
                    }
                int Hours = TimeInSec/3600;
                int Min = (TimeInSec%3600)/60;
                int Sec = TimeInSec%60;
                System.out.print("The time is " + String.format("%02d", Hours)+":"+String.format("%02d", Min)+":"+String.format("%02d\n", Sec));
                
   		    }
}
                

