package coddingTask;

import java.util.Scanner;

public class Task8Nailya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Coding Task #8
		 * Write a java program to find the second largest number in the array.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to store inside an array?");
		int size=scan.nextInt();
		int[] numbers=new int[size];
		
		for(int i=0; i<size; i++) { 
			System.out.println("Please enter value to be stored to index "+i);
			numbers[i]=scan.nextInt();}
		int largest = numbers[0];
		int secondLargest=numbers[0];
		for(int j=1; j<size; j++) {
			if(numbers[j]>largest) {
				 secondLargest=largest;
				largest=numbers[j];}
			if (numbers[j]<largest && numbers[j]>secondLargest) {
				secondLargest=numbers[j];
			}}
		System.out.println("The second largest number is "+secondLargest);
}}
