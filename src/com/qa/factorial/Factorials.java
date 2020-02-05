package com.qa.factorial;

public class Factorials {

	public static void main(String[] args) {
		System.out.println(factorial(39916800));
	}
	public static int factorial(int input){
		
		int value = 0;
		double dblInput = (double) input;
		
		
		while (dblInput > 1.0 && Math.floor(dblInput) == dblInput) {
			value++;
			dblInput = dblInput / value;
			System.out.println("Step "+value+", input is now "+dblInput);
		}
		if (Math.floor(dblInput) != dblInput) return 0;
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
