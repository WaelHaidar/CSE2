//Wael Haidar
//Lab 2: Cyclometer 03/9/14 12:12 pm
//CSE2 Section 112 CRN 48811
//My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds, 
//and the number of rotations of the front wheel during that time.

public class Cyclometer{
    
    public static void main(String[] args){
        
        int secsTrip1 = 480; //record the time in sec for the first trip
        int secsTrip2=3220; //record the time in sec for the second trip
        int countsTrip1=1561; //record the number of rotations of the
                              //front wheel of the cycle in the first trip
        int countsTrip2=9037; //record the number of rotations of the
                              //front wheel of the cycle in the second trip
        double wheelDiameter=27.0; // Set the constant of the wheel Diameter
        double PI=3.14159; // Set the constant PI
        double feetPerMile=5280; //Set the conversion rate between feet and mile
        double inchesPerFoot=12; //Set the conversion rate between inches and foot
        double secondsPerMinute=60; //Set the conversion rate between seconds and minutes
        double distanceTrip1, distanceTrip2, totalDistance; // Declare the name of the outputs
            
        //Print out the information about the trips 
        //(time took and the counts of the rotation)
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
                
        distanceTrip1/=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //for each count, a rotation of the wheel travels
        //the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile;
        // Gives distance in miles
        distanceTrip2/=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;

        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
      }
    
}


