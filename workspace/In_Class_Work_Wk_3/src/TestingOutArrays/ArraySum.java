package TestingOutArrays;
import java. io.*;
public class ArraySum {


	 public static void main ( String[] args ) 
	  {
	    int[][] data = { {3, 2, 5},
	                   {1, 4, 4, 8, 13},
	                   {9, 1, 0, 2},
	                   {0, 2, 6, 3, -1, -8} };
	    
	    int size=data.length,largestRow=0,sum=0,col=0;
	 
	    for(int check=0;check<=(size-1); check++)
	    {
	    	if (largestRow<data[check].length)
	    	{
	    		largestRow=data[check].length;
	    	}
	    }
	    
	    do {
	    	for ( int row=0; row < data.length; row++)
	    	{
	    		 if (col<(data[row].length))
	    		 {
	    			 sum+=data[row][col];
	    		 }
	        }
	    col+=1;
	   
	       }while(col!=largestRow);
	    System.out.println("the sum for the array is " +sum  );

	  }