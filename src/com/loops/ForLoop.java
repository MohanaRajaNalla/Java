package com.loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			System.out.println(i + " " + "Hai");
		}
	}

}
