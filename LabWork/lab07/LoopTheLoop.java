//Wael Haidar
//lab07:LoopTheLoop 10/08/14 12:08 pm
//CSE2 Section 112 CRN 48811

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class LoopTheLoop{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;//declare an instance of the scanner object
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter an int between 1 and 15: ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())//check if the user inputed an int
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int nStars = myScanner.nextInt();
   		        if(nStars>15 || nStars<1)
   		            {System.out.println("You did not enter an int between 1 and 15");
   		            return; 
   		            }
   		        int w= 0;
   		        while ( w<nStars )
   		            {System.out.print ("*");
   		             w++;
   		            }
   		        int n= 1;
   		        System.out.println("");
   		        while (n<=nStars)
   		                {int x=0;
   		                 while (x<n)
   		                    {System.out.print ("*");
   		                     x++;
   		                    }
   		                n++;
   		                System.out.println ("");
   		                }
   		           
   		                
   		            }
   		    }