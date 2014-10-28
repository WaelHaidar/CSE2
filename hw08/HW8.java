//Wael Haidar
//hw08:HW08 10/27/14 6:52 pm
//CSE2 Section 112 CRN 48811

import java.util.Scanner;//allow the use of the scanner utility from the library 
public class HW8{
   public static char getInput(Scanner scan, String Compare ){//starting the method getInput
        scan=new Scanner(System.in);//constructing the scanner and accepting input
        String x = scan.next();//storing the input from the scanner into a string x 
        char y = x.charAt(0);//changing the string x into a char
        int length = x.length();//checking the length of the inputed (X)
        char input = y;//declaring a variable char called input and assigning it
        if ( length >1 )//checking the lenth of the user's input x
            { System.out.println("A single character is expected try again");//prints out the error message if needed
                input = getInput (scan, Compare);//calls the method input
                return input;//return to the method to restart it 
            }
        char[] result = Compare.toCharArray();//divides the string Compare into a characters and store them in an array
        while(!(Compare.indexOf(y)!=-1)){//check if the character inputed is present in the array of characters (result)
            System.out.println ("You did not enter a character from the list '" + Compare +"'; try again- ");//prints out an error message if needed
            input = getInput (scan, Compare);//calls the method input
            return input;//return to the method to restart it 
        }
        if ( Compare.indexOf(y)!=-1){
            return input;//return to the method to restart it
            }
        else { input = getInput (scan, Compare);//calls the method input
            return input;//return to the method to restart it 
            }
    }
    public static char getInput(Scanner scan, String Compare, int Check ){//starting the method getInput
        scan=new Scanner(System.in);//constructing the scanner and accepting input
        String x = scan.next();//storing the input from the scanner into a string x 
        char y = x.charAt(0);//changing the string x into a char
        int length = x.length();//checking the length of the inputed (X)
        char input = y;//declaring a variable char called input and assigning it
        char[] result = Compare.toCharArray();//divides the string Compare into a characters and store them in an array
        if ( length >1 ){//checking the lenth of the user's input x
            System.out.println("A single character is expected; try again");//prints out the error message if needed
            if (Check > 1){//to control the number of times it repeates itself and restart the method 
                Check--;//decrease the number by 1 
                input = getInput (scan, Compare, Check);//calls the method input
                return input;//return to the method to restart it 
            }
            else {
                input = ' ';
                return input;//return to the method to restart it 
            }
        }
        else{
            if ( Compare.indexOf(y)!=-1){
                return input;//return to the method to restart it 
            }
            else {
                System.out.println ("You did not enter a character from the list '" + Compare + "'; try again- ");
                if (Check>1){
                    Check--;
                    input = getInput (scan, Compare, Check);//calls the method input
                    return input;//return to the method to restart it 
                }
                else { System.out.println ("You failed after 5 tries");//prints an error message
                    input = ' ';
                    return input;//return to the method to restart it 
                }
            }
        }
    }
    public static char getInput(Scanner scan,String Prompt,  String Compare ){
        System.out.println (Prompt);
        scan=new Scanner(System.in);
        String x = scan.next();
        char y = x.charAt(0);
        int length = x.length();
        char input = y;
        if ( length >1 )
            { System.out.println("A single character is expected.");
                input = getInput (scan, Prompt, Compare);//calls the method input
                return input;//return to the method to restart it 
            }
        char[] result = Compare.toCharArray();
        while(!(Compare.indexOf(y)!=-1)){
            System.out.println ("You did not enter an acceptable character");
            input = getInput (scan, Prompt, Compare);//calls the method input
            return input;//return to the method to restart it 
        }
        if ( Compare.indexOf(y)!=-1){
            return input;}
        else { input = getInput (scan, Prompt, Compare);//calls the method input
            return input;//return to the method to restart it 
        }
    }
        
    
    public static void main(String []arg){//the main method
	    char input;
	    Scanner newScan =new Scanner(System.in);//construct the scanner variable and accept input
	    System.out.print("Enter 'C' or 'c' to continue- ");//prints out the prompt for the user to respond 
    	input=getInput(newScan,"Cc");//calls the method input
    	System.out.println("You entered '"+input+"'");//prints out the result
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//prints out the prompt for the user to respond 
    	input=getInput(newScan,"yYnN",5); //calls the method input //give up after 5 attempts
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");//prints out the result
    	}
    	input=getInput(newScan,"Choose a digit.","0123456789");//calls the method input
    	System.out.println("You entered '"+input+"'");//prints out the result
  }  
}