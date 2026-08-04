package com.loops;

import java.util.Scanner;

public class LoopWhile {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		
		
		
		while(num > 0) {			
			System.out.println("Enter a Number: ");
			num = sc.nextInt();
			System.out.println(num);
		}
	}

}
//Loop runs until the user enters the zero or value less than zero