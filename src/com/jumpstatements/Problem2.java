package com.jumpstatements;

public class Problem2 {
	//Only Odds in 1 - 100
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
