package com.methods;

public class RetruningValue {
	
	
	public static void main(String[] args) {
		
		RetruningValue obj = new RetruningValue();
		
		
		// you need to catch the return value that the method is returning. 
		int c =  obj.product(120, 5);
		System.out.println(c);
		
		
		
		
	}
	
	//void means it returning nothing if you put anything like int char string then it must return the value
	//which type of that datatype in this case its integer
	
	
	int product(int a, int b ){
		
		return a*b;
		
		
	}

}
