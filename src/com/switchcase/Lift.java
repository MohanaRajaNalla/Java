package com.switchcase;

import java.util.Scanner;

public class Lift {
	public static void main(String[] args) {
		System.out.println("Enter the Floor: ");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		switch(floor) {
		
		case 1:
			System.out.println("Reached First Floor");
			break;
			
		case 2:
			System.out.println("Reached Second Floor");
			break;
		
		case 3:
			System.out.println("Reached Third Floor");
			break;
			
		case 4:
			System.out.println("Reached Fourth Floor");
			break;
		
		default:
			System.out.println("Invalid Floor Number");
		}
			
		
	}

}
