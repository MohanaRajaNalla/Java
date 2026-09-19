package com.jumpstatements;

public class Problem1 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if(i >= 3 && i <= 7) {
				continue;
			}
			
			if(i == 9) {
				break;
			}
			System.out.println(i);
			
		}
		
	}

}
