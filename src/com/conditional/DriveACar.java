package com.conditional;

import java.util.Scanner;

public class DriveACar {
	public static void main(String[] args) {
		System.out.println("Enter Your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		
		if(age >= 18) {
			System.out.println("Do you Have Driving License: ");
			boolean License = sc.nextBoolean();
			if(License) {
				System.out.println("Eligible to Drive");
			}
			
			else {
				
				System.out.println("You dont have a valid License");
				
			}		
		
		}
		else {
			System.out.println("Not Eligible");
		}
	}

}
