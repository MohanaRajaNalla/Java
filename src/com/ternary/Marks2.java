package com.ternary;

import java.util.Scanner;

public class Marks2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the marks: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		String Grade = marks > 90 && marks <= 100 ? "A" : marks > 80 && marks <= 90 ? "B" :
			marks > 70 && marks <= 80 ? "C" : marks > 60 && marks <= 70 ? "D" :
				marks >= 35 && marks <= 60 ? "E" : "Fail";
					
		
		System.out.println(Grade);
		
	}

}
