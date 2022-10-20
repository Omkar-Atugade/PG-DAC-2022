// prime numbers between two numbers

import java.lang.*;
import java.util.*;

class PrimeNumbersBetweenNumbers{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the end number : ");
		int n2 = sc.nextInt();
		
		for(int i = n1; i <= n2; i++){
			
			if (isPrime(i)) {  
               System.out.println(i);  
           }  
		}  
	}  
	public static boolean isPrime(int n) {  
		if (n <= 1) {  
			   return false;  
		}  
		for (int i = 2; i <= Math.sqrt(n); i++) {  
			   if (n % i == 0) {  
				   return false;  
			   }  
		}  
	    return true;    
		
		
	}
}