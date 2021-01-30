import java.lang.*;
import java.io.*;
import java.util.*;



public class methodsForTesting {
	
	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void testEvenOdd(int numberOfTests) {
		
		for (int i=0; i<numberOfTests; i++) {
			int randInt = (int) (Math.random()*1000);
			System.out.println(randInt);
			System.out.println("BITWISE: "+(evenBitwise(randInt) == true ? "Even" : "Odd"));
			System.out.println("NORMAL: "+(evenNormal(randInt) == true ? "Even" : "Odd"));
			System.out.println("\n");
		}
	}
	

	
	public static boolean evenBitwise(int n) {
		return ((n & 1)!=1); //check if last binary digit is 1. If so, it's odd.
	}
	
	public  static boolean evenNormal(int n) {
		boolean x;
		if (n%2 == 0) { //divides by 2 and check if there's any remainder. If there is, it's odd.
			x=true;
		}else {
			x=false;
		}
		
		return x;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void testMultiplyBy2(int numberToMultiply) {		//Version 1 - Multiplies parameter by 2
		
		int x1 = numberToMultiply*2;
		int x2 = numberToMultiply<<1;
		
		System.out.println("BITWISE: "+x2);
		System.out.println("NORMAL: "+x1);
		System.out.println("\n\n");
		
	}
	
	public static void testMultiplyBy2(boolean x, int loops ) {		//Version 2 - Multiplies [2nd parameter] numbers by 2
		
		if (x = true){
			for (int i=0; i<loops; i++) {
				int r = (int) (Math.random()*1000);
				int x1 = r*2;
				int x2 = r<<1;
				
				System.out.println("BITWISE: "+x2);
				System.out.println("NORMAL: "+x1);
				System.out.println("\n\n");
			}
		}
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////

	
	
	
	public static void testPalindrome(String x) {
		
		System.out.println("NORMAL: "+(isPalindrome(x) == true ? "Palindrome" : "None"));
		
	}
	
	public static boolean isPalindrome(String x) { //Optimized
		
		StringBuilder z = new StringBuilder();
		
        z.append(x);
		String y = z.reverse().toString().toLowerCase().replace(" ", "");
		
		String xLow = x.toLowerCase().replace(" ", "");
		
		
		
		//System.out.println(xLow);
		//System.out.println(y);
		//System.out.println((xLow.equals(y)));
		
		return (xLow.equals(y));
		
	}
	
	
	
	
	
	
	

}
