package com.jumpstatements;

public class Problem8 {
	public static void main(String[] args) {
		outer:
		for(int i = 1; i <= 100; i++) {
			
			inner:
			for(int j = 1; j <=100; j++) {
				
				if(j == 2) {
					break outer;
					
				}
				
				System.out.println(i);
				
			}
		}
	}

	
}
