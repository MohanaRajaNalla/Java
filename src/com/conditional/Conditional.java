package com.conditional;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		
		System.out.println("Enter Marks");
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks > 90 && marks <=100) {
			System.out.println("A Grade");
		}
		else if(marks > 80 && marks <= 90) {
			System.out.println("B Grade");
		}
		else if(marks > 70 && marks <= 80) {
			System.out.println("C Grade");
		}
		else if(marks > 60 && marks <= 70) {
			System.out.println("D Grade");
		}
		else if(marks >= 35 && marks <= 60) {
			System.out.println("E Grade");
		}
		else if(marks > 0 && marks < 35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Marks");
		}
		
		
	}

}
