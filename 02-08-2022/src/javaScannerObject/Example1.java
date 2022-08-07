package javaScannerObject;

import java.util.Scanner;

public class Example1 {

	
	public static void main(String[] args) {


		//Resource leak: 'Scanner is never closed
		Scanner scanner = new Scanner(System.in);
		
		//variable declaration
	double radius;
	double area;
	
	//for getting values from user
	System.out.println("Enter the value of radius");
	radius = scanner.nextDouble();
	 
	//scanner closing statement
	scanner.close();
	
	//expression for area of circle
	area = 2*Math.PI*radius;
	
	System.out.println(area);
	
	
	
	
	}

}
