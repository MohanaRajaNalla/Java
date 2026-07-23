package operators;

public class RealationalOperators {
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		 
		int c = 10;
		
		System.out.println(a > b); //False
		System.out.println(a  < b); //True
		;
		System.out.println(b > a);  //True
		System.out.println(b < a); //False;
		
		System.out.println(a <= b); //True
		System.out.println(a >= b); //False
		
		System.out.println(b >= a);  //True
		System.out.println(b <= a ); //False
		
		System.out.println( a == b); //False
		System.out.println(a == c);  //True
		System.out.println( a!= b); //True
		System.out.println( a!= c); //False
		
		
		boolean d = a > b; //False
		boolean f = a == b; //False
		System.out.println(d);
		System.out.println(f);
	}

}
