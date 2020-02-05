package com.qa.factorial;

public class Factorials {

	public static void main(String[] args) {
		System.out.println(factorial(479001601));
	}
	public static int factorial(int input){
		
		int value = 0;
		double value2 = input;
		
		
		while (input > 1) {
			value++;
			input = input / value;
			if (Math.floor(input) != value2)		
				System.out.println(input + "  is not a factorial!");
			
			System.out.println("Step "+value+", input is now "+input);
		}
		if (input == 0) return 0;
		else return value;
		
//		for(int i =1; i<10;i++) {
//			
//			value = factorialValue/i;
//			System.out.println(value);
//			
//			
//		}
//		return value;
	}
		
	
}
