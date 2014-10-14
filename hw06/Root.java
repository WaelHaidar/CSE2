//Wael Haidar
//hw06:Root 10/10/14 05:31 pm
//CSE2 Section 112 CRN 48811

//This program forces the user to enter a double that is greater than 0,
//then uses an algorithm to compute the square root of the number, and
//then prints it out. 

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class Root{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;//declare an instance of the scanner object
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter a positive double to evaluate its square root: ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextDouble())//check if the user inputed a double 
                    { System.out.println("You did not enter an double");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int Number = myScanner.nextInt();//accept the user's input and stores it as a double
                if(Number <0)//sets the range of the accepted inputs
                    {System.out.println("You did not enter a positive double");
                    return;//leave the program
                    }
                Double High= 1.00+Number;//initiate the double High and gives it its value 
                Double Low = 0.00;//initiate the double Low and gives it its value 
                Double Difference=1.00+Number;//initiate the double Difference and gives it its value 
                Double Middle = (High+Low)/2;//initiate the double Middle and gives it its value 
                while (Difference >= (0.0000001*(1+Number))){//start the loop at the condition where the
                //Difference is bigger than a number and continue the loop until it is
                //smaller or equal to 
                    if ((Middle * Middle) > Number){//checks the value of Middle squared and compare it to the Number
                        High = Middle;//if the condition is satisfied the value of High changes to the Middle value 
                    }
                    else {Low = Middle;}//if the initial condition is not met the value of Low changes to the Middle value 
                    Middle = (High+Low)/2;//assign the value of Middle in the scope of the loop
                    Difference = High-Low;//assign the value of Difference in the scope of the loop
                }
                Middle= Math.round(Middle*1000)/1000.000d;//Round the value of Middle to the nearest double with 2 decimal place s
                System.out.println ("The approximation of the square root of " + Number + " is= "+ Middle);//Prints the result
   		    }
}
                
                    