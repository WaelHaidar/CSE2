//Wael Haidar
//hw06:Roulette 10/10/14 02:46 pm
//CSE2 Section 112 CRN 48811

//This program uses a random number generator (Math.random()) to simulate 
//a person’s betting on 100 spins, but run the simulation 1000 times and
//collect data on the outcome. 

import java.util.*;//allow us to use the all the utilities from the java library
public class Roulette{
    // main method required for every Java program
    public static void main(String[] args) {
        
        Random Number = new Random(); // Keep this stored as a field
        List<String> R = Arrays.asList("00","0","1","2","3","4","5","6","7","8","9","10","11","12",
        "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
        "31","32","33","34","35","36");//stores all the possible outcomes of a Roulette wheel in a list
        System.out.println ("Roulette Spin results: ");//prints out the sentence 
        //The following initialize and assign the int variables (win, loss, x, wins, losses, lossAll) 
        int x=0;
        int wins = 0;
        int losses = 0;
        int lossAll = 0;
        int TotalWin=0;
        int Money=0;
        while (x<1000)//starts the loop with a condition that x is less than 1000
   		    {
   		    String bet = R.get(Number.nextInt(R.size()));//randomly choosing from the list R to simulate the bet of the player
   		    int win=0;
            int loss=0;
   		    int w= 0;//initialize and assign the int variable w
   		    while ( w<100 )//starts the loop witha  condition that w is less than 100
   		        {
   		        String spin = R.get(Number.nextInt(R.size()));//randomly choosing a spin from the list R
   		        if (spin == bet)//start a conditional statement to decide if the spin was a win or a loss
   		            {win++;
   		            Money = Money + 36;
   		            TotalWin++;
   		            }//if the condition was true the spin is a win so the number of wins will increase by 1
   		        else {loss++;}//if the condition was false the spin is a loss so the number of losses is increased by 1
   		        w++;//add a 1 on the spin number w
   		        }
   		    if (win == 0)//if the number of wins in the 100 spins is zero that will add to the loss All a one
   		       {
   		       lossAll++;//this means that the player lost all his money in the spins
   		       }
   		    if (win >= 3)//if the number of wins in the 100 spins is bigger or equal to 3 that will add to the wins a one
   		       {
   		       wins++;//which means that the player can leave the table witha a win
   		       }
   		    if (win <3 && !(win==0))//if the number of wins in the 100 spins is smaller than 3 but not equal to zero that will add to the losses a one
   		       {
   		       losses++;//this means that the player left the table at each 100 spins with a loss
   		       }
   		    Money = Money - 100;
   		    x++;//increase x by 1 so the 100 spin will be repeated till 1000 times 
   		    }
   		//The following prints out the results of the simulation of the roulette game
   		System.out.println ("Number of times the player loses everything in each 100 spin: " + lossAll);
   		System.out.println ("Number of times the player walks away with a profit in one session of 100 spins of the wheel: " + wins);
   		System.out.println ("Number of times the player walks away with a loss in one session of 100 spins of the wheel: " + losses);
   		System.out.println ("Number of wins in the 1000 times repetition of the 100 spin= " + TotalWin );
   		if (Money<0)//checks if the game ended with a total loss or win and prints accordingly
   		    {System.out.println ("The money the player loses after playing 100 spins 1000 times= $" + (Math.abs(Money)));}//formats the Money result as a positive number
   	    else{System.out.println ("The money the player wins after playing 100 spins 1000 times= $" + (Money));}
   		
    }
}