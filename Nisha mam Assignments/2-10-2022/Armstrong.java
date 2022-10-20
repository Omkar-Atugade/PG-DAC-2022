import java.lang.*;
import java.util.*;

class Armstrong{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int n = sc.nextInt();
		
		int rem = 0, sum = 0, num, digit = 0;
		num = n;
		
		while(num > 0){
			
			num = num / 10;
			digit = digit + 1;
		}
		
		num = n;
		while(num != 0){
		
			rem = num % 10;
			sum = sum + (int)(Math.pow(rem, digit));
			num = num / 10;
		}
		
		if(sum == n){
			System.out.println("Given number is a armstrong.");
		}
		else{
			System.out.println("Given number is not a armstrong.");
		}
	}
}