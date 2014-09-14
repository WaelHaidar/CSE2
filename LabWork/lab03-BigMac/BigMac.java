//Wael Haidar
//lab03: Big Mac 9/12/14 10:00 pm 
//CSE2 Section 112 CRN 48811

//This program computes the cost of buying a some Big Macs.  
//It uses the Scanner class to obtain from the user
//how many Big Macs, the cost per Big Mac, and the percentage
//tax (which depends on the state; 6% in PA, 8% in MA, etc). 
//It then displays the total cost.

import java.util.Scanner;//import the scanner utility from the java library to be 
                         //used in the program
public class BigMac {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; //declare an instance of the scanner object
   			       myScanner = new Scanner( System.in );//call the Scanner constructor
   			       //to print out the command to the user to enter the number of Big Macs ordered
   			       System.out.print("Enter the number of Big Macs(an integer > 0): ");
   			       int nBigMacs = myScanner.nextInt();//accept the user's input and stores it as an int
   			       //print the command for the userto respond to with the required input
   			       System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): " );
                   double bigMac$ = myScanner.nextDouble();//assign the double
                   //print the command for the userto respond to with the required input
	               System.out.print("Enter the percent tax as a whole number (xx): ");
                   double taxRate = myScanner.nextDouble();//assign the double for the tax rate 
                   taxRate/=100; //user enters percent, but what is needed is a proportion
                   double cost$;
                   int dollars,   //whole dollar amount of cost 
                   dimes, pennies; //for storing digits
                   //to the right of the decimal point for the cost$ 
                   cost$ = nBigMacs*bigMac$*(1+taxRate);
                   //get the whole amount, dropping decimal fraction
                   dollars=(int)cost$;
                   //get dimes amount, e.g., 
                   // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                   //  where the % (mod) operator returns the remainder
                   //  after the division:   583%100 -> 83, 27%5 -> 2 
                   dimes=(int)(cost$*10)%10;
                   pennies=(int)(cost$*100)%10;
                   System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+ bigMac$ +" per bigMac, with a" +  
                   " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);

   			  }
}



