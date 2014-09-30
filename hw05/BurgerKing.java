//Wael Haidar
//hw05:BurgerKing  9/29/14 05:15 pm 
//CSE2 Section 112 CRN 48811

//This program prompts the user to enter a choice of a burger, a soda,
//or fries. Then the program prompts the users for details of their choices. 

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class BurgerKing{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	Scanner myScanner;
   	myScanner = new Scanner( System.in );//call the Scanner constructor
   	System.out.println("Enter a letter to indicate a choice of");
    System.out.println("    Burger (B or b)");
    System.out.println("    Soda (S or s)");
    System.out.print("    Fries (F or f)  ");
   	//print the command for the user to respond to with the required input ;
   	String order = myScanner.next(); //regiter the user's input and store it in a string (order)
    int length = order.length();//find the length of the input (order) and store it in an int
    if ( length >1 ) //check if the length found earlier is bigger than 1
        { System.out.println("A single character expected");// if the length is found to be bigger than 1 the program
        //prints out that error message and terminates
        return;}
    // this next part of the program will check the order and compare it to a set of values 
    if (order.equals ("B")|| order.equals ("b")){ //checks if the input is b or B for a burger
        Scanner myScanner2;//initiate a new scanner 
        myScanner2 = new Scanner(System.in);//allow the user to input a new entry
        System.out.println("Enter A or a for all the fixins");//ask the user for info by printing a command
        System.out.println("    C or c for cheese");
        System.out.print("    N or n for none of the above  ");
        String orderfixins = myScanner2.next(); //Store the user's input in a string called (orderfixins)
        // The following will check the orderfixins input and compare it with a set to decide which fixin does the user want
        if (orderfixins.equals ("C") || orderfixins.equals("c"))
            {System.out.println("You ordered a burger with cheese");//print out the final order of the user
            return;}// Terminate 
        if (orderfixins.equals("A") || orderfixins.equals("a"))
            {System.out.println("You ordered a burger with all the fixins");//print out the final order of the user
            return;}// Terminate 
        if (orderfixins.equals("N") || orderfixins.equals("n"))
            {System.out.println("You ordered a burger with no fixins");//print out the final order of the user
            return;} // Terminate 
            else {System.out.println("You did not enter any of A, a, N, n, C, or c");//if the user inputs anything other than the required by the command
        //the program prints out an error message and terminate
                return;}}
    if (order.equals ("S") || order.equals ("s")) //Check if the input (order)is a S or s for soda 
        {Scanner myScanner3;//initiate a new scanner 
        myScanner3 = new Scanner(System.in);//allow the user to input a new entry
        System.out.print("Do you want Pepsi(p or P), Coke(c or C), Sprite(s or S) or Mountain Dew(M or m)  ");//ask the user for info by printing a command
        String Soda = myScanner3.next();//Store the user's input in a string called (Soda)
        // The following will check the orderfixins input and compare it with a set to decide what type of drink does the user want
        if (Soda.equals ("P") || Soda.equals("p"))
            {System.out.println("You ordered a Pepsi");//print out the final order of the user
            return;}// Terminate 
        if (Soda.equals("c") || Soda.equals("C"))
            {System.out.println("You ordered a Coke");//print out the final order of the user
            return;}// Terminate 
        if (Soda.equals("S") || Soda.equals("s"))
            {System.out.println("You ordered a Sprite");//print out the final order of the user
            return;}// Terminate 
        if (Soda.equals("M") || Soda.equals("m"))
            {System.out.println("You ordered a Mountain Dew");//print out the final order of the user
            return;}// Terminate 
            else {System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");//if the user inputs anything other than the required by the command
        //the program prints out an error message and terminate 
                return;}}
    if (order.equals ("F") || order.equals ("f"))//Check if the input (order)is a F or f for Fries
        {Scanner myScanner4;//initiate a new scanner 
        myScanner4 = new Scanner(System.in);//allow the user to input a new entry
        System.out.print("Do you want a large or small order of fries (l,L,s,or S)  ");//ask the user for info by printing a command
        String fries = myScanner4.next();//Store the user's input in a string called (fries)
        // The following will check the orderfixins input and compare it with a set to decide what size of fries does the user want (L or l for large and S or s for small)
        if (fries.equals ("l") || fries.equals("L"))
            {System.out.println("You ordered large fries");//print out the final order of the user
            return;}// Terminate 
        if (fries.equals ("s") || fries.equals("S"))
            {System.out.println("You ordered small fries");//print out the final order of the user
            return;}// Terminate 
            else {System.out.println("You did not enter any of S, s, L, or l");//if the user inputs anything other than the required by the command
        //the program prints out an error message and terminate
                return;}}
    else {System.out.println("You did not enter any of B, b, S, s, F, or f");//if the user inputs anything other than the required by the first order command
        //the program prints out an error message and terminate
            return;}

    }
}
