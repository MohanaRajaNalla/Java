package com.bodmas;

public class Bodmas {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		
		
		/*Bracket
		 * Of
		 * Division
		 * Multiplication
		 * Addition
		 * Subtraction
		 * 
		 * 
		 * 
		 * increements and decreements have highest priority
		 * as well as && have top most prority than ||
		 */
		
		System.out.println(a + b + a / a * a);
		//10 +  20 + 10 / 10 * 10
		// 10 + 20 + 1 * 10
		// 10 + 20 + 10
		//40
		
		
		System.out.println(a + b - a * a *  a / b + (a+b));
		//10 + 20 - 10 * 10 * 10 / 20 + (10 + 20 ) ;
		//10 + 20 - 10 * 10 * 20 / 20 + 30;
		//10 + 20 - 100 * 10 / 20 + 30;
		//10 + 20 - 1000 / 20 + 30;
		//10 + 20 - 50 + 30;
		//30 - 50 + 30;
		// -20 + 30
		//10
		
		System.out.println(a++ + b + a + b);
		//10++ + 20 + 10 + 20;
		//10 + 20 + 11 + 20
		// 61
		
		
		
		
		
	}
}
