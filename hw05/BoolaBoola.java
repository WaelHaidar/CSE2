//Wael Haidar
//hw05:BoolaBoola  9/29/14 05:15 pm 
//CSE2 Section 112 CRN 48811

//This program has three boolean variables to each of which the value of true or false
//is randomly assigned. Then, at random, combine the three variables with random choices 
//of && and || and stores the result. The program should then present the expression
//to the user and ask the user to state the result of of the expression.

import java.util.*;//allow me to use all the utilities from the java library such as Scanners and Random
public class BoolaBoola{
   // main method required for every Java program
   public static void main( String args[] ){
      Scanner myScanner;
      myScanner = new Scanner( System.in );//call the Scanner constructor
      // create random object
      Random RandomBoolean = new Random();
      boolean value = RandomBoolean.nextBoolean();//Creat a random boolean and stores it in (value)
      boolean value2 = RandomBoolean.nextBoolean();//Creat a random boolean and stores it in (value1)
      boolean value3 = RandomBoolean.nextBoolean();//Creat a random boolean and stores it in (value2)
      Random r = new Random(); // Keep this stored as a field
      List<String> l = Arrays.asList("||", "&&");//create a list of strings which are {&& and ||}
      String a = l.get(r.nextInt(l.size()));//picks and random string from the list (l) and stores it in a string "a"
      String b = l.get(r.nextInt(l.size()));//picks and random string from the list (l) and stores it in a string "b"
      //the following command print the command line for the user to respond to
      System.out.print ("Does " +value +" "+ a+" "+ value2 +" "+ b+" " +value3+ " have the value true(t/T) or false(f/F)? ");
      String userInput = myScanner.next();//stores the user's input into a string variable "userInput"
      boolean answer= false;//initiate a variable boolean and assign it an initial value 
      if (a.equals("||")) //compares the random variable "a" generated to || 
         { answer = value || value2;}//perform the right operation on the first two random booleans generated and stores the result in the boolean answer
      if (a.equals("&&"))//compares the random variable "a" generated to &&
         { answer = value && value2;} //perform the right operation on the first two random booleans generated and stores the result in the boolean answer
      boolean answer1= false;//initiate a variable boolean and assign it an initial value 
      if (b.equals("||"))//compares the random variable "b" generated to || 
         { answer1= answer || value3;}//perform the right operation on answer and value3 generated and stores the result in the boolean answer1
      if (b.equals("&&"))//compares the random variable "b" generated to && 
         { answer1= answer && value3;}//perform the right operation on answer and value3 generated and stores the result in the boolean answer1
      //The following part of the program checks the user input as a response to the question and compares it to the answer1 generated and see if its right or wrong
      if (userInput.equals("t") || userInput.equals ("T"))
         {if (answer1 == true)
             { System.out.println("Correct");}//print out a correct statement if the user's answer is equal to the answer1 found
                else {System.out.println("Wrong; try again");//print out a wrong statement if the user's answer is not equal to the answer1 found
                    return;}//terminates 
            return;}//terminates 
      if (userInput.equals("f") || userInput.equals ("F"))
         {if (answer1 == false)
             {System.out.println("Correct");}//print out a correct statement if the user's answer is equal to the answer1 found
                else {System.out.println("Wrong; try again");//print out a wrong statement if the user's answer is not equal to the answer1 found
                    return;}}//terminates 
      else {System.out.println("You did not enter f, F, t, or T");//this error statement wil be printed if the user's input does not match any required input
                    return;}}//terminates 
}
