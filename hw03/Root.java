//Wael Haidar
//hw03:Root  9/13/14 06:55 pm 
//CSE2 Section 112 CRN 48811

//This program prompts the user to enter a double and then prints out a 
//crude estimate of the cube root of the number and the value of this crude
//guess when cubed.

import java.util.Scanner;//import the scanner utility from the java library to be 
                         //used in the program
public class Root {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; //declare an instance of the scanner object
   			       myScanner = new Scanner( System.in );//call the Scanner constructor
   			       System.out.print("Enter a double, and I print its cube root: "); //print the command for the user to respond to with the required input 
   			       double Number = myScanner.nextDouble();//accept the user's input and stores it as a double
   			       double Guess = Number/3;//calculate the guess for the cube root and store it as a double
   			       Guess= (2*Guess*Guess*Guess+Number)/(3*Guess*Guess);//calculate a better guess and substitute the previous guess
   			       Guess= (2*Guess*Guess*Guess+Number)/(3*Guess*Guess);//calculate a better guess and substitute the previous guess
   			       Guess= (2*Guess*Guess*Guess+Number)/(3*Guess*Guess);//calculate a better guess and substitute the previous guess
   			       Guess= (2*Guess*Guess*Guess+Number)/(3*Guess*Guess);//calculate a better guess and substitute the previous guess
   			       Guess= (2*Guess*Guess*Guess+Number)/(3*Guess*Guess);//calculate a better guess and substitute the previous guess
   			       System.out.println("The cube root is: " + (Guess));//print the cube root guess
   			       System.out.println((Guess)+"*"+(Guess)+"*"+(Guess)+"="+(Guess*Guess*Guess));//make sure the guess is precise by calculating guess*guess*guess
   			  }
}
