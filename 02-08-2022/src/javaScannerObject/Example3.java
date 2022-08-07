package javaScannerObject;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		//Resource leak: 'Scanner is never closed
				Scanner scanner = new Scanner(System.in);
				
				int result;
				int a;
				int b;
			System.out.println("Enter value of a");
			a = scanner.nextInt();
			
			System.out.println("Enter value of b");
			b = scanner.nextInt();
			
			//it is compulsory to close the scanner
			scanner.close();
			
			result = (a*a)-(2*a*b)+(b*b);
			System.out.println(result);
			
			
	}

}
