package com.conditional;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("Divisible by 5");
		}
		else {
			System.err.println("Not Divisible by 5");
		}
		
	}

}
