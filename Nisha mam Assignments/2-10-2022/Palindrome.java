import java.lang.*;
import java.util.*;

class Palindrome{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int n = sc.nextInt();
		
		int rev = 0, rem = 0, num;
		num = n;
		
		while(num != 0){
			
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		if (rev == n){
			System.out.println("Given number is palindrome.");
			
		}
		else{
			System.out.println("Given number is not a palindrome.");
		}
	
	}
}

