package com.logical;

public class LogicalOperator {
	public static void main(String[] args) {
		
		
		
		/*Logical AND &&
		 * T  T = T
		 * T  F = F
		 * F  T = F
		 * F  F = F
		 * 
		 * Logical OR ||
		 * 
		 * T  T = T
		 * T  F = T
		 * F  T = T
		 * F  F = F
		 * 
		 */
		
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		
		System.out.println(a && b);
		// t && f = false
		System.out.println(a && c);
		//t && t = true
		System.out.println(b && a);
		//f && t = false
		
		
		System.out.println(a || b);  //t || f = t
		System.out.println(b || a);  //f || t = t
		System.out.println(a || c); //t || t = t
		System.out.println(b || b);  //f || f = f
		
		
		
		
		
		
		
	     boolean isTrue = true;
	     boolean isFalse = false;
	     
	     boolean and = isTrue && isFalse;
	     System.out.println(and);
			
	}

}
