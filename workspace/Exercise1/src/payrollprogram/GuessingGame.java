package payrollprogram;
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
	private static Scanner newscanner;

	public static void main(String[] args) {	 
		
			System.out.println ("I am thinking of a number from 1-10 so pick one."); 
				 
					
		  newscanner = new Scanner(System.in);
		  boolean check=false; // boolean value for while loop
		  int number , counter=0; //number will be input , counter keep track of while loop iterations 
		  int rng=(int) (Math.random()*10+1);//generates a random number from 1-10
		  System.out.println (rng); //print out the number, used for testing
		  while(check==false)
		  {
			  if(counter>2);
			  {System.out.println("Awe To Bad, you Lose!");
			  break; // break exits the while loop
			  
			  }
			

}

			
		
		// TODO Auto-generated method stub

	}

}
