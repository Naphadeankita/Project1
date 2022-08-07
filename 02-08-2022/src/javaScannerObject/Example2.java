package javaScannerObject;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		//Resource leak: 'Scanner is never closed
		Scanner scanner = new Scanner(System.in);
		
		int result;
		int num1;
		int num2;
	System.out.println("Enter num1");
	num1 = scanner.nextInt();
	
	System.out.println("Enter num2");
	num2 = scanner.nextInt();
	
	//it is compulsory to close the scanner
	scanner.close();
	
	result = num2%num1;
	System.out.println(result);
	
	
	
	
	
		
	}

}
