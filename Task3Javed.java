package coddingTask;

import java.util.Scanner;

public class Task3Javed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a 2D array of integers. Develop a program 
		 * which will calculate the sum of even and odd
		 * numbers for that array.
		*
		*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter size of the arry:");
		
		int n = scan.nextInt();
	  // create an int array of size n
	  int numbers[]= new int[n];
		
	  System.out.println("Enter array elements: ");
	  for (int i = 0; i < n; ++i) {
	   numbers[i]= scan.nextInt();
	  }
		
	  displayOddEven(numbers);
	  scan.close();
	   
	   
	}
	// method to display even or odd in array
	 public static void displayOddEven(int[] numbers) {
	  // traverse through the array
	  for (int i : numbers) {
	   if(i%2 == 0)    // even
	    System.out.println(i+": Even");
	   else        // odd
	    System.out.println(i+": Odd");
	  }  
}


	}
	

