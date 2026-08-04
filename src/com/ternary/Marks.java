package com.ternary;

import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int marks = sc.nextInt();;
		
		String Grade = marks > 90 ? "A" : marks > 80 ? "B" : marks > 70 ? "C" : marks > 60 ? "D" : marks > 35 ? "E" : "Fail";
		System.out.println(Grade);
	}
	
	

}
