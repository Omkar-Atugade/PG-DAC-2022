import java.lang.*;
import java.util.*;

class ParseInt{
	
	public static void main(String args[]){
	
		String s1 = args[0];
		String s2 = args[1];
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
		int sum = i + j;
		
		System.out.println(sum);
	}
}


//In Java, while operating upon strings, there are times when we need to convert a number represented as
// a string into an integer type. We usually do this because we can operate with a wide flexible set of 
//operations over strings. The method generally used to convert String to Integer in Java is parseInt() 
//of String class.