package Tree;

import java.io.InputStream;
import java.util.Scanner;

public class TreeProject {

}
public static void main(String[] args)

{
	int a=0;//first loop
	int b=0;//nested loop
	int c=0; //keeps track of the stars in a row;
	
      Scanner in = newScanner(System.in);
 	 
      System.out.println("Enter the length of your tree");
     int length = in.nextInt();
	
	while(a<length)
	{ 
		
		while(b<=c)
		{
			System.out.print("*");
			b++;
		
		}
		System.out.println(" ");
		c=a+1;
		a++;
		b=0;
				
	}
	
	in.close();
	
	
}
private static Scanner newScanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}

}
