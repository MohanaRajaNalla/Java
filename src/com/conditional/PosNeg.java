package com.conditional;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Postive Number");
		}
		else if(num < 0) {
			System.out.println("Negative Number");
		}
		else if(num == 0) {
			System.out.println("Its Zero");
		}
		else {
			System.out.println("Invalid Number");
		}
	}

}
