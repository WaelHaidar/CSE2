//Wael Haidar
//hw07:NumberStack 10/9/14 12:34 pm
//CSE2 Section 112 CRN 48811

// The program forces the user to enter an integer between 1 and 9, inclusive, and then prints
//out displays that depend on the value entered 

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class NumberStack{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;//declare an instance of the scanner object
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter an integer between (1-9): ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())//check if the user inputed an int
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int Number = myScanner.nextInt();//accept the user's input and stores it as an int
                if(Number <1 || Number >9)//sets the range of the accepted inputs
                    {System.out.println("You did not enter an int between 1 and 9");
                    return;//leave the program
                    }
                System.out.println ("Using for loops: ");//Prints out the method that will be used 
                int Base=1, Line=0, count=1, nDashes=1, Spaces=8;//initiate the variables and assign them 
                for (Base=1; Base<=Number; Base++){//Start the loop that will set the output based on the input
                    for(Line=0; Line<Base; Line++){//Start the loop that will count the lines 
                        for (Spaces=8; Spaces>= Base; Spaces--){
                            System.out.print(" ");
                        }
                        for (count=1; count<=((Base*2)-1); count++){// Start the loop that will set the number of times the base is printed
                            System.out.print(Base);//Print the base
                        }
                       System.out.println (); //leave a line free
                    }
                        for (Spaces=8; Spaces>= Base; Spaces--){//condition for the loop
                            System.out.print(" ");//prints out a space 
                        }
                        for (nDashes=1; nDashes<=((Base*2)-1);nDashes++){//start the loop that sets the number of dashes 
                            System.out.print("-");//print the dashes 
                        }
                        System.out.println();//leave a line free
                    }
                System.out.println ("Using while loops: ");//Prints out the method that will be used
                Base=1;//reset the base to 1
                while (Base<=Number){//Prints out the method that will be used 
                    Line=1;//rest the line number to 1
                    while(Line<=Base){//Start the loop that will count the lines 
                        Spaces=8;//sets the variable 
                        while (Spaces >= Base){//sets the condition for the loop
                            System.out.print(" ");//prints out a space 
                            Spaces--;}//decrease the number of spaces by 1
                            
                        count=1;//reset the count to 1
                        while ( count<=((Base*2)-1)){// Start the loop that will set the number of times the base is printed
                            System.out.print(Base);//prints the base
                            count++;//increment the count 
                        }
                        System.out.println (); //leave a line free
                        Line++;//increment the line number 
                        }
                    Spaces=8;//sets the variable 
                    while (Spaces >= Base){//sets the condition for the loop
                        System.out.print(" ");//prints out a space 
                        Spaces--;}//decrease the number of spaces by 1 
                    nDashes=1;//resert the nDashes variable to 1
                    while (nDashes<=((Base*2)-1)){//start the loop that sets the number of dashes 
                        System.out.print("-");//prints out the dashes 
                        nDashes++;//increment the nDashes 
                    }
                    System.out.println();//leave a line free
                    Base++;//increment the Base 
                }
                System.out.println ("Using do-while loops: ");//Prints out the method that will be used
                Base=1;//reset the variable Base to 1 
                do{Line=1;//reset the variable Line to 1
                    do{
                    Spaces =9;//sets the variable 
                    do {System.out.print (" ");//prints a space 
                        Spaces--;}//decrease spaces by 1 
                    while(Spaces>= Base); //Condition for the loop to work 
                        count=1;//reset the variable count to 1
                        do {System.out.print(Base);//prints out the Base
                            count++;}//increment the count 
                            while (count<=((Base*2)-1));//the condition that sets the number of times the base is printed 
                        System.out.println (); //leave a line free
                        Line++;//increment the Line variable
                     }
                    while (Line<=Base);//The condition of the loop that sets the number of lines printed 
                    Spaces =9;//sets the variable 
                    do {System.out.print (" ");//prints a space 
                        Spaces--;}//decrease spaces by 1 
                    while(Spaces>= Base); //Condition for the loop to work 
                    nDashes=1;//reset the variable nDashes to 1
                    do {System.out.print("-");//prints the dashes 
                        nDashes++;}//increment the variable nDashes 
                    while (nDashes<=((Base*2)-1));//The condition of the loop that sets the number of dashes printed 
                    System.out.println();//leave a line free
                    Base++;//incremnet the Base variable 
                }
                while(Base<=Number);//The condition that sets the number of of times it repeats itself
                
   		    
   		    }
}
                        