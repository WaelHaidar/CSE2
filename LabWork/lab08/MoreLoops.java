import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;
	System.out.print("Enter an int- ");//prints out the command for the user to input
	if (!scan.hasNextInt()){
	do { 
	    scan.next();//check the input from the user
	    System.out.println("You did not enter an int; try again- ");}//prints out an error command if the condition was true
	while(!scan.hasNextInt());}//check if the input is an integer and thus decide to run the loop
	
//	while(!scan.hasNextInt()){
//	    scan.next(); //get rid of the junk entered by user
//	    System.out.print("You did not enter an int; try again- ");
	//COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        n=scan.nextInt();//saves the input in an int n
    int j=0;//initialize and assign the int variable j
    while (j<n && j<40){//the condition of the while loop
        int k=0;//initialiuze and assign the int variable k
        while (k<j+1){//the condition of the while loop
            System.out.print('*');//print the result
            k++;//increment k
        }
        System.out.println();//prints a free line 
        j++;//increment j
    }
	//for(int j=0;j<n && j<40;j++){
	  //  for(int k=0;k<j+1;k++){
		//System.out.print('*');
	    //}
	   // System.out.println();
	//}
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
	int k=4;
    while (k<4){
        System.out.println("k=" +k);
        k++;
    }
	//do{
	//    System.out.println("k="+k);
	//    k++;
	//}
    //     while(k<4);
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

        //int count=0;
        for (int count=0;true; count++){
            if (n>5 || n<1){
                System.out.println(n + " is > 5 or <1");
                return;
            }
            if (n==1 || n==2){
                System.out.print("Case 2 "); 
            }
            if (n==3){
                return;
            }
            if (n==4){
                System.out.println("Case 4");
            }
            if (n==5){
                System.out.println("Case 5");
                return;
            }
            if(count>10){
                return;
            }
        }
       // while(true){
	    //switch(n){
	    //default: System.out.println(n + " is > 5 or <1");
		//break;
	    //case 1: 
	    //case 2: System.out.print("Case 2 "); 
		//continue;
	    //case 3: break;
	    //case 4: System.out.println("Case 4");
	    //case 5: System.out.println("Case 5");
		//break;
	    //}
	    //count++;
	    //if(count>10)
		//break;
	//}
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}