//Wael Haidar
//hw04:IncomeTax 9/19/14 07:33 pm 
//CSE2 Section 112 CRN 48811

//This program prompts the user to enter an int that gives the
//thousands of dollars of income and then writes out the amount 
//of tax on the income, given the following (progressive)
//schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class IncomeTax{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;//declare an instance of the scanner object
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter an int giving the number of thousands: ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())//check if the user inputed an int
                    {System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int NumberOfThousands = myScanner.nextInt();//accept the user's input and stores it as an int
                if(NumberOfThousands <0)//check if the input is positive
                    {System.out.println("You did not enter a positive int");
                    return; //leaves the program
                    }
                //All the below code check what is the input compared to the set range so it can be associate it with the right percentage of tax
                //the after finding the percentage it prints out the value of the income tax and make its decimal places only one
   			    if (NumberOfThousands<20) 
   			        {System.out.println ("The tax rate on $"+(NumberOfThousands)+",000 is 5%, and the tax is $"+(String.format("%.1f",(NumberOfThousands*1000*0.05))));
   			        }
   			    if (NumberOfThousands>=20 && NumberOfThousands<40)
   			        {System.out.println ("The tax rate on $"+(NumberOfThousands)+",000 is 7%, and the tax is $"+(String.format("%.1f",(NumberOfThousands*1000*0.07))));
   			        }
   			    if (NumberOfThousands>=40 && NumberOfThousands<78)
   			        {System.out.println ("The tax rate on $"+(NumberOfThousands)+",000 is 12%, and the tax is $"+(String.format("%.1f",(NumberOfThousands*1000*0.12))));
   			        }
   			    if (NumberOfThousands>=78)
   			        {System.out.println ("The tax rate on $"+(NumberOfThousands)+",000 is 14%, and the tax is $"+(String.format("%.1f",(NumberOfThousands*1000*0.14))));
   			        }
   			    
}}