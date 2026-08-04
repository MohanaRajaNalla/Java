package com.switchcase;

import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {
		System.out.println("Enter the Letter");
		Scanner sc = new Scanner(System.in);
		
		char letter = sc.next().charAt(0);
		
		switch(letter) {
		
		case 'A':
			System.out.println("Letter A");
			break;
			
		case 'B':
			System.out.println("Letter B");
			break;
			
		case 'C':
			System.out.println("Letter C");
			break;
			
		default:
			System.out.println("Invalid Letter");
			//No Need to Write the break becasue default case is the last case right.
		}
		
	}

}
