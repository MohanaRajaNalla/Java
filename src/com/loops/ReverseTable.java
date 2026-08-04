package com.loops;

import java.util.Scanner;

public class ReverseTable {
	public static void main(String[] args) {
		System.out.println("Enter the Table you want: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Enter the Number of times you want: ");
		int times = sc.nextInt();
		
		for(int i = times; i >= 1; i --) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
