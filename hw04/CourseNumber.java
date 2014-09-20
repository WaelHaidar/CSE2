//Wael Haidar
//hw04:CourseNumber 9/19/14 8:10 pm 
//CSE2 Section 112 CRN 48811

//The semester during which a course is offered at Lehigh is given
//by a 6 digit number. The first four digits give the year, and the
//last two digits give the semester: 10 spring, 20 summer 1, 30 summer 2,
//and 40 fall. This program reads in a 6 digit number, adhering
// to the above description, and then prints out the semester and year.

import java.util.Scanner;//allow us to use the scanner utility from the java library
public class CourseNumber{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter a six digit number giving the course semester: ");
   			    //print the command for the user to respond to with the required input
   			    if(!myScanner.hasNextInt())
                    { System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates 
   		        	}
   		        int CourseNumber = myScanner.nextInt();//accept the user's input and stores it as an int
   			    if(CourseNumber <=186510 || CourseNumber >=201440)
                    {System.out.println("The number was outside the range [186510,201440]");
                    return;
                    }
                int year= (int)(CourseNumber/100);
                int Semester = CourseNumber %100;
                if (Semester==10)
                    {System.out.println ("The course was offered in the spring semester of "+(year));
                    return;
                    }
                if (Semester==20)
                    {System.out.println ("The course was offered in the summer 1 semester of "+(year));
                    return;
                    }
                if (Semester==30)
                    {System.out.println ("The course was offered in the summer 2 semester of "+(year));
                    return;
                    }
                if (Semester==40)
                    {System.out.println ("The course was offered in the fall semester of "+(year));
                    return;
                    }
                    else {System.out.println ((Semester)+" is not a legitimate semester");
                    return;
                    }
                    
   		    }
}       
                    
                    
                    