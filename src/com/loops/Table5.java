package com.loops;

import java.util.Scanner;

public class Table5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Table you Want: ");
		int num = sc.nextInt();
		
		System.out.println("Enter Number of Times: ");
		int times = sc.nextInt();
		
		
		for(int i = 1; i <= times; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
