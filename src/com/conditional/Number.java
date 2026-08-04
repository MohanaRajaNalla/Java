package com.conditional;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//String empty = sc.nextLine();
		//System.out.println(empty);
		String grade = sc.nextLine();
		System.out.println(grade);
		System.out.println(grade + num);
		
	}

}

/*This program is to just showcase that after the int input we can't take the string 
input directly if we do like that that enter when we press after entering the 
integer that enter also considered as a character and it assigned to the String variable so we need to put
an empty variable between that then taht enter will be captured by that empty string*/