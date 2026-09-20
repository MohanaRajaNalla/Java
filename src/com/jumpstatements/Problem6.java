package com.jumpstatements;

public class Problem6 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<= 100; i++) {
			
			if(i > 50) {
				
				if(i % 17 == 0 && i % 2 == 0) {
					break;
					
				}
				
			}
			
			System.out.println(i);
			
			
			
		}
		
	}

}
