//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

import java.lang.*;
import java.util.*;

class PetersonNumber{

	public static void peterson(int x){
	
		int num, rem = 0, sum = 0;
		num = x;
		
		while(num != 0){
			int fact = 1;
			rem = num % 10;
			
			for(int i = 1; i <= rem; i++){
				
				fact = fact*i;
			}
			
			sum = sum + fact;
			num = num / 10;
		}
		if(sum == x){
			System.out.println("Given number is peterson.");
			
		}
		else{
		
			System.out.println("Given number is not peterson.");
		}
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to chcek : ");
		int n = sc.nextInt();
		
		peterson(n);
	}
}