import java.lang.*;
import java.util.*;

class Factorial{
	public static void fact(String s){
		int f = 1;
		int n = Integer.parseInt(s);
		
		for(int i = 1; i <= n; i++){
			f = f*i;
		}
		System.out.println("Factorial is : "+f);
	}
	
	public static void main(String args[]){
	
		fact(args[0]);
		
	}
}