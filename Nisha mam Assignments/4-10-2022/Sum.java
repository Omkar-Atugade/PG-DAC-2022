import java.lang.*;
import java.util.*;

class Sum{
	public static void addition(String s1, String s2){
		int sum = 0;
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		sum = n1 + n2;
		System.out.println("Sum is : "+sum);
	}
	
	public static void main(String args[]){
	
		addition(args[0], args[1]);
		
	}
}