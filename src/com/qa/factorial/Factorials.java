package com.qa.factorial;

public class Factorials {

	public static void main(String[] args) {
		
	}
	public static int factorial(){
		
		int factorialValue = 150;
		int value = 0;
		
		for(int i =1; i<10;i++) {
			
			value = factorialValue/i;
			System.out.println(value);
			
			
		}
		return value;
	}
		
	
}
