import java.lang.*;
import java.util.*;

class ReverseNumber{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int num, rem = 0, rev = 0;
		num = n;
		
		while(num != 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		System.out.println("Reversed number is = "+rev);
	}
}