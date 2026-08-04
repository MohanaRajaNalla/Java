package operators;

public class UnaryOperator {
	
	public static void main(String args[]) {
		
		int a = 5;
		int b = 10;
		
		System.out.println(+a); //5
		System.out.println(-a); //-5
		
		System.out.println(-b); //-10
		
		int d = -a;
		System.out.println(d);  //-5
		
		
		System.out.println(a++); //5
		System.out.println(a); //6
		System.out.println(--b); //9
		System.out.println(b);  //9
		 
		int e = 6;
		int f = 7;
		 
		System.out.println(e++ + f++ + e-- + f--);
		//6++ + 7++ + 7-- + 8--
		//6 + 7 + 7 + 8
		// 28
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(e++ + e++ + e--);
		
		//6++ + 7++ + 8--
		//6 + 7 + 8
		
		e = 6;
		f = 7;
		
		System.out.println(--e);
		
		System.out.println(--f);
		
		
		System.out.println(e++ + --e + f++ + --f);
		//5++ + --6 + 6++ + --7
		//5 + 5 + 6 + 6 = 22
		System.out.println(e);
		System.out.println(f);
		
		
		System.out.println(f++ + --f+ ++f);
		//6++ + --7 + ++6
		//6 + 6 + 7
		//19
		
		
		boolean z = true;
		boolean y = false;
		
		/* Not Operator
		 * 
		 * !True = False;
		 * !False = True;
		 */
		
		
		System.out.println(!z); // Not z Means not of a so false
		System.out.println(!y);  // true
		
	}

}
