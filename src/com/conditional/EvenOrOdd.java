package com.conditional;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check its even or odd: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
