package javaUnaryOperators;

public class Example3
{

	public static void main(String[] args) {
		
		int num1 = 50, num2 = 38, num3 = 81, result;
		
		result = num3-- + ++num1 + num3++ + ++num2 - --num1 + num2++ + num3++;
		      
		//81+51+80+39-50+39+81
		
		System.out.println(result);
		

	}

}
