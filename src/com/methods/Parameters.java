package com.methods;

public class Parameters {
	
	public static void main(String[] args) {
		
		
		Parameters obj = new Parameters();
		obj.add(10,50);
		obj.subtract(10, 20, 30);
		
		
		
		
		
	}
	
	void add(int a, int b) {
		
		
		System.out.println(a+b);
		
		
	}
	
	void subtract(int a, int b, int c) {
		
		System.out.println(a-b-c);
		
	}

}
