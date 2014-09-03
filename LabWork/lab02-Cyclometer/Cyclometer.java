//Wael Haidar
//Lab 2: Cyclometer 03/9/14 12:12 pm
//CSE2 Section 112 CRN 48811
//My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds for each trip, 
//and the number of rotations of the front wheel during that time.
//then it calculates the distance cycled in miles in the first trip and the second one
//and then give you the total distance (miles) in both these trips

public class Cyclometer{
    
    public static void main(String[] args){
        
        int secsTrip1 = 480; //record the time in sec for the first trip
        int secsTrip2=3220; //record the time in sec for the second trip
        int countsTrip1=1561; //record the number of rotations of the
                              //front wheel of the cycle in the first trip
        int countsTrip2=9037; //record the number of rotations of the
                              //front wheel of the cycle in the second trip
        double wheelDiameter=27.0; // Set the constant of the wheel Diameter
        double PI=3.14159; // Set the constant PI
        double feetPerMile=5280; //Set the conversion rate between feet and mile
        double inchesPerFoot=12; //Set the conversion rate between inches and foot
        double secondsPerMinute=60; //Set the conversion rate between seconds and minutes
        double distanceTrip1, distanceTrip2, totalDistance; // Declare (initialize) the name of the variables
            
        //Print out the time in min the trip 1 and 2 took and the counts
        //of the rotation of its wheel in the form of: Trip 1 took (time) minutes and had (rotation count) counts
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        //The following set up an equation to calculate the distance of each trip and
        //then change them from inches to miles        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //for each count, a rotation of the wheel travels
        //the diameter in inches times PI
        distanceTrip1=inchesPerFoot*feetPerMile;
        // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; //give the total distance of both the trips

        //Print out the output data ( the distance in miles for each of the trips and the total distance)
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
      }
    
}


