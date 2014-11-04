//Wael Haidar
//lab05:RandomGames  9/24/14 12:30 pm 
//CSE2 Section 112 CRN 48811

//program that uses the Scanner class to obtain from the user
//one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
//card from a deck of playing cards.

import java.util.Scanner;
import java.util.*;//allow us to use the scanner utility from the java library
public class RandomGames{
    			// main method required for every Java program
   		    public static void main(String[] args) {
   		        Scanner myScanner;
   			    myScanner = new Scanner( System.in );//call the Scanner constructor
   			    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
   			    //print the command for the user to respond to with the required input ;
                String x = myScanner.next();
                int length = x.length();
                if ( length >1 )
                    { System.out.println("A single character expected");}
                char t = x.charAt(0);
                if(t =='R' || t== 'r')
                    {Random Number = new Random(); // Keep this stored as a field
                    List<String> R = Arrays.asList("00","0","1","2","3","4","5","6","7","8","9","10","11","12",
                    "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
                    "31","32","33","34","35","36");
                    String a = R.get(Number.nextInt(R.size()));
                    System.out.println ("Roulette: "+a );
                    return;}
                if (t == 'C' || t == 'c')
                    {Random r = new Random(); // Keep this stored as a field
                    List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
                    int a = l.get(r.nextInt(l.size()));
                    int b = l.get(r.nextInt(l.size()));
                    System.out.println ("Craps: " + a +"+"+ b + "=" + (a+b));
                    return;}
                if (t == 'P' || t== 'p')
                    {Random card = new Random(); // Keep this stored as a field
                    List<String> l = Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King");
                    String a = l.get(card.nextInt(l.size()));
                    Random type = new Random();
                    List<String> T = Arrays.asList ("Heart","Diamond", "Clubs", "Spades" );
                    String b = T.get(type.nextInt(T.size()));
                    System.out.println (a +" of " + b);
                    return;}
                else {System.out.println( "'"+(x)+"'" + "is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                      return;}
   		    }
}
                
                  
