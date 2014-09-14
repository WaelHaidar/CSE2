//Wael Haidar
//hw03:Bicycle  9/12/14 10:28 pm 
//CSE2 Section 112 CRN 48811

//The program prompts the user to enter two digits, the first 
//giving the number of counts on a cyclometer and the second giving
//the number of seconds during which the counts occurred, and then an
//then prints out the distance traveled and the average miles per hour.

import java.util.Scanner;//import the scanner utility from the java library to be 
                         //used in the program
public class Bicycle {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; //declare an instance of the scanner object
   			       myScanner = new Scanner( System.in );//call the Scanner constructor
   			       System.out.print("Enter the number of seconds: ");
   			       int secsTrip = myScanner.nextInt();//accept the user's input and stores it as an int
   			       //print the command for the user to respond to with the required input ; //assign the time variable in sec for the trip
   			       System.out.print("Enter the number of counts: ");
                   int countsTrip = myScanner.nextInt();//accept the user's input and stores it as an int
   			       //print the command for the user to respond to with the required input ;; //assign the number of rotations of the
                   //front wheel of the cycle in the trip
                   double wheelDiameter=27.0; // Set the constant of the wheel Diameter
                   double PI=3.14159; // Set the constant PI
                   double feetPerMile=5280; //Set the conversion rate between feet and mile
                   double inchesPerFoot=12; //Set the conversion rate between inches and foot
                   double secondsPerMinute=60; //Set the conversion rate between seconds and minutes
                   double distanceTrip; // Declare (initialize) the name of the variable
                   //The following set up an equation to calculate the distance of each trip and
                   //then change them from inches to miles        
                   distanceTrip=countsTrip*wheelDiameter*PI;
                   // Above gives distance in inches
                   //for each count, a rotation of the wheel travels
                   //the diameter in inches times PI
                   distanceTrip=distanceTrip/(inchesPerFoot*feetPerMile);
                   // Gives distance in miles   
                   double MinutesPerhour=60; //Set the conversion rate between minutes and hours
                   double speed= distanceTrip/(secsTrip/(secondsPerMinute*MinutesPerhour));
                   //to change the outputs form to 2 decimal places only
                   distanceTrip = distanceTrip*100; 
                   distanceTrip = (double)((int)(distanceTrip));
                   distanceTrip = distanceTrip /100;
                   speed = speed*100; 
                   speed = (double)((int)(speed));
                   speed = speed /100;
                   //Print out the time in min the trip took and the distance the bicycle traveled in miles
                   System.out.println("The distance was "+ (distanceTrip) +" miles and took "+
                   (secsTrip/secondsPerMinute)+" minutes.");
                   System.out.println("The average mph was "+ (speed));
                   
   			  }
}
                  