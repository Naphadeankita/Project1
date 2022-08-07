package javaReadingConcepts;

import java.util.Scanner;

public class Example1 
{
	
	/**
	 * Write a java program to calculate simple interest.
	 * 
	 * read the values of principle amount, 
	 * rate of interest, 
	 * and time duration from user.
	 * 
	 */
	
	public static void main(String[] args) 
	{		
		
		//Resource leak: 'scanner' is never closed
		Scanner scanner = new Scanner(System.in);
		
		double simpleInterest = 0.0;
		
		double principleAmount;
		float rateOfInterest;
		int duration;
		
		System.out.println("Enter Principle Amount:");
		principleAmount = scanner.nextDouble();
		
		System.out.println("Enter Rate Of Interest:");
		rateOfInterest = scanner.nextFloat();
		
		System.out.println("Enter time duration: ");
		duration = scanner.nextInt();
		
		scanner.close();
		
		simpleInterest = (principleAmount*rateOfInterest*duration)/100;
		
		System.out.println(simpleInterest);
		
		
	}

}