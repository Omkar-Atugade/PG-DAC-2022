import java.lang.*;
import java.util.*;

class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int n = sc.nextInt();
		
		int num, rem=0, rev =0;
		num = n;
		
		while( num != 0 ){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		
		if ( rev == n ){
			System.out.println("Given number is a palindrome number");
		}
		else{
			System.out.println("Given number is not a palindrome number");
		}
		
		
	}
}