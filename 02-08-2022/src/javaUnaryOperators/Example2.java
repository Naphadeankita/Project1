package javaUnaryOperators;

public class Example2 {

	public static void main(String[] args) {
		
		int num1 = 5, num2 = 8, num3 = 11, result;
		
		result = num1++ + --num2 - num3--;
		       //5 + 7 - 11 = 1
		
		System.out.println(result);
		

	}

}
