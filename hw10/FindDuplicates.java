//Wael Haidar
//hw10:HW08 11/15/14 7:05 pm
//CSE2 Section 112 CRN 48811

// In this program The method hasDups() should return true if and only if the input
//array has at least one repeated entry. The method exactlyOneDup() returns true if
//and only if there is exactly one repeated entry

import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);//construct and initiate the scanner variable 
        int num[] = new int[10];//assign the size of the int array num
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");//prints out the command
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();//accept the input of the user and save it in the array 
                //the value of j determines the position of the information in the array
            }
            String out = "The array ";//initiate the string out
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {//calls the method hadDups
                out += "has ";//if the method returned true the has string will be added to the out string
            }
            else {
                out += "does not have ";//if the method returned false then this string will be added
            }
            out += "duplicates.";//this string is added to out
            System.out.println(out);//the string out is printed on a line 
            out = "The array ";//change the string out back to "the array"
            out += listArray(num);//add the list array method output to out
            if (exactlyOneDup(num)) {//check if the array inputed has only one duplicate
                out += "has ";//if the returned value was true has is added to out
            }
            else {
                out += "does not have ";//if the returned value was false "does not have" is added to out
            }
            out += "exactly one duplicate.";//this is added to out 
            System.out.println(out);//the string out is printed out
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//this prints out the command
            answer = scan.next();//accept the user's reply and store it in answer
        } while (answer.equals("Y") || answer.equals("y"));//check if the answer is Y or y so the do statements are repeated
    }

    public static String listArray(int num[]) {
        String out = "{";//initiate the string out
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";//adds the "," for out
            }
            out += num[j];//add the array values to out
        }
        out += "} ";//add } to out
        return out;//return the value of out
    }
public static boolean hasDups (int [] x){
    for (int i=0; i<x.length; i++){
        for (int j=i+1; j<x.length; j++){
            if (x[j]==x[i]) {//check if dupliactes exist 
                return true;}//return true
        }
    }
    return false;//return false 
}
public static boolean exactlyOneDup (int [] x){
    int a=0;//initiate the int variable a and assign it
    for (int i=0; i<x.length; i++){
        for (int j=i+1; j<x.length; j++){
            if (x[j]==x[i]){//check for duplicates 
                a++;//if the duplicate is found a is incremented 
            }}}
            if (a==1){//if a is equal to one thus there is only one duplicate
                return true;//the method will return true
            }
            else {return false;}//if it is not then it will return a false 
}
}