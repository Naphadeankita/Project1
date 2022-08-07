package javaUnaryOperators;

public class Example1 {

	public static void main(String[] args) {
		
		int num1 = 5, num2 = 8, num3 = 11, num4 = 23, result1, result2, result3, result4;
		
		//there is no change in value
		result1 = num1--;//post decrement
		result2 = num2++;//post increment
		
		System.out.println(result1);
		System.out.println(result2);
		
		//there is change in value
		result3 = --num3;//pre decrement
		result4 = ++num4;//pre increment
		
		System.out.println(result3);
		System.out.println(result4);
		

	}

}
