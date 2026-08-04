package com.ternary;

public class TernaryOPerator {
	public static void main(String[] args) {
		
		
		
		int age = 18;
		
		String eligible = age >= 18 ? "Eligible" : "Not Eligible";
		System.out.println(eligible);
		
		
		
		int num = 10;
		String val = num > 0 ? "Positive" : num == 0 ? "Zero" : "Negative";
		System.out.println(val);
	}
}
