package com.methods;

public class Problem1 {
	public static void main(String[] args) {
		
		Problem1 obj = new Problem1();
		
		
		int c = obj.add(10, 20);
		System.out.println("addition 1 :" +c);
		
		int d = obj.add(30, 40);
		System.out.println("addition 2 :" +d);
		
		
		int a = obj.product(c, d);
		System.out.println("Product of 1 & 2 : " +a);
		
		
		
		
		
		
		
		
		
	}
	
	int add(int a, int b) {
		
		return a+b;
		
	}
	
	int product(int a, int b) {
		
		
		return a * b;
	}
	
}
