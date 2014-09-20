//Wael Haidar
//lab04:BigMacAgain  9/17/14 12:11 pm 
//CSE2 Section 112 CRN 48811

//This program uses the Scanner class to obtain from users
//how many Big Macs they want and whether they want an order
//of fries. It then prints out the total cost of the meal.

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class BigMacAgain{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter the number of Big Macs that you want to order: ");
   			    //print the command for the user to respond to with the required input ;
   			    if(!myScanner.hasNextInt())
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   			    int Number = myScanner.nextInt();//accept the user's input and stores it as an int
                if(Number <0)
                    {System.out.println("You did not enter an int > 0");
                    return;
                    }
                Double PriceOfBigMac = 2.22;
                System.out.println ("You ordered"+ (Number)+ "Big Macs for a cost of " + (Number)+"x"+(PriceOfBigMac)+"="+"$"+(Number*PriceOfBigMac));
                Scanner myScanner2;                
                myScanner2 = new Scanner( System.in );//call the Scanner constructor
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                String FriesOrder = myScanner2.next();
                if (FriesOrder.equals ("y")|| FriesOrder.equals ("Y"))
                    { System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is" +"$"+((Number*PriceOfBigMac)+2.15));
                    }
               
               else if (FriesOrder.equals ("n")|| FriesOrder.equals ("N"))
                    { System.out.println("The total cost of the meal is" +"$"+(Number*PriceOfBigMac));
                    }
                    else {System.out.println("You did not enter (y,Y,n,N)");
                    return;
                    }
                    
   			}}
