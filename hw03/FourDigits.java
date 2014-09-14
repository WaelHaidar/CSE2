//Wael Haidar
//hw03:FourDigits  9/13/14 05:25 pm 
//CSE2 Section 112 CRN 48811

//This program prompts the user to enter a double and  then prints out
//the first four digits to the right of the decimal point.

import java.util.Scanner;//import the scanner utility from the java library to be 
                         //used in the program
public class FourDigits {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; //declare an instance of the scanner object
   			       myScanner = new Scanner( System.in );//call the Scanner constructor
   			       System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
   			       //print the command for the user to respond to with the required input ;
   			       double Number = myScanner.nextDouble();//accept the user's input and stores it as a double
   			       Number= Number*10000;//mutiply the number inputed by 10000
   			       Number= (int)Number;//Explicitly cast the double "Number" into an int to get rid of the extra decimal places
   			       int FirstDigit= (int)Number % 10;//give us the reminder of dividing the number by 10 and store it as an int 
   			       int Number2 = (int)Number/10;//get rid of one digit that we already processed
   			       int SecondDigit= Number2 % 10;//give us the reminder of dividing the number by 10 and store it as an int
   			       int Number3= (int)Number/100;//get rid of the first two digits that we already processed
   			       int ThirdDigit= Number3 % 10;//give us the reminder of dividing the number by 10 and store it as an int
   			       int Number4= (int)Number/1000;//get rid of the first three digits that we already processed
   			       int FourthDigit= Number4 % 10;//give us the reminder of dividing the number by 10 and store it as an int
   			       System.out.println ("The four digits are:"+(FourthDigit)+""+(ThirdDigit)+""+(SecondDigit)+""+(FirstDigit));
   			       //Print the four digits required
   			     
   			       
   			  }
}