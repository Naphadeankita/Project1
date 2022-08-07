package javaUnaryOperators;

public class Example4 {

	public static void main(String[] args) {
		
		int num1 = 5, num2 = 8, num3 = 11, result;
		
		result = num1-- + ++num3 - num1++ + ++num2 + num3--;
		       //5 + 12 - 4 + 9 + 12 = 34
		
		System.out.println(result);
		

	}

}