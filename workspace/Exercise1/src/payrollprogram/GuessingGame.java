package payrollprogram;
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
	public static void main(String[] args) {	 
		
			System.out.println ("I am thinking of a number from 1-10 so pick one."); 
				 
					
		  Scanner newscanner= new Scanner(System.in);//creates Scanner
		  boolean check=false; // boolean value for while loop
		  int number , counter=0; //number will be input , counter keep track of while loop iterations 
		  int rng=(int) (Math.random()*10+1);//generates a random number from 1-10
		  System.out.println (rng); //print out the number, used for testing
		  while(check==false)
		  {
			  if(counter>2);
			  {System.out.println("You are out of quesses, you Lose!");
			  break; // break exits the while loop
			  
			  }
	       System.out.println ("I am thinking of a number from 1-10 so pick one."); 
	       number=newscanner.nextInt();
	     
	     if(number==rng) // if the input number matches random number you win
		   {System.out.println("Hip Hip Hooray! You won the game");
		    check=true;
					
		   }
	     if(number==rng) // if the input number matches random number you win
		   {System.out.println("Right! You won the game");
		    check=true;
		   }
		else if((number+1==rng)||(number-1==rng)) // if you are 1 number below or above random number you are hot
			{System.out.println("Hot");
			
			}
		else if((number+2==rng)||(number-2==rng)) // if you are 2 numbers below or above random number you are warm
		{System.out.println("Warm");
		
		}
				
		else 
		{System.out.println("Cold"); // if you are any of the above your cold
		
		}
	  counter++;	//increments the time through the loop
			
 
	

}


	   
			
		
		
		

		
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
