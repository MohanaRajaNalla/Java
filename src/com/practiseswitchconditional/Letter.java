package com.practiseswitchconditional;

import java.util.Scanner;

public class Letter {
	
	
	public static void main(String[] args) {
		System.out.println("Enter a Day: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Using Terinary
		
		String day = num == 1 ? "Sunday" : num == 2 ? "Monday"
				: num == 3 ? "Tuesday" : num == 4 ? "Wednesday" : 
					num == 5 ? "Thursday" : num == 6 ? "Friday" : num == 7 ? "Saturday" : "Invalid Day";
		System.out.println(day);
		
		
		
		//Using Switch
		
		switch(num) {
		
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Invalid Day");
		}
		
		
		
		
		//Conditional Statements
		
		if(num == 1) {
			System.out.println("Sunday");
		}
		else if(num == 2) {
			System.out.println("Monday");
		}
		else if(num == 3) {
			System.out.println("Tuesday");
		}
		else if(num == 4) {
			System.out.println("Wednesday");
		}
		else if(num == 5) {
			System.out.println("Thursday");
		}
		else if(num == 6) {
			System.out.println("Friday");
		}
		else if(num == 7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid Day");
		}
		
		
		
		
	}

}
