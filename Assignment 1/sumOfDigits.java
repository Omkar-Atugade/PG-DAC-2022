import java.lang.*;
import java.util.*;

class sumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		
		int sum = 0, rem ,num ;
		num = n ;
		
		while ( num != 0){
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			
		}
		System.out.println("Sum of digits of given number is = " +sum);
	}

}