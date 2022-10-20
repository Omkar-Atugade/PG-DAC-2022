import java.lang.*;
import java.util.*;

class PrimeNumber{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want : ");
		int n = sc.nextInt();
		
		int count = 1;
		
			if(n == 0 || n == 1){
				
				System.out.println("Number is not a prime number.");
			}
			
			for(int i = 2; i <= n; i++){
				
				if(n % i == 0){
					count = count + 1;
				}		
				
			}
			if(count > 2){
				System.out.println("Number is not a prime number.");
			}
			else{
				System.out.println("Number is a prime number.");
			}
		
	}
}