package com.methods;
	
public class Method {
	
	//Main Method also a a method look voide is the return type main is the method namne 
	//we know that jvm class the main method while running the code thats y we didnt call it anywhere
	//every method u write excepect main method will be called from inside the main method then only it will be executed
	public static void main(String[] args) {
		
		Method obj = new Method();
		
		
		//if the method is a non static method then we need to call that method using an object;
		obj.sum();
		
		add();
		
		
		
		
		
	}
	
	
	void sum() {
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
	}
	
	
	static void add() {
		
		int a = 30;
		int b = 40;
		
		System.out.println(a+b);
	}
	
	
	
	
}
