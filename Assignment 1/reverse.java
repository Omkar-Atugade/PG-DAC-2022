import java.lang.*;
import java.util.*;

class reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		
		int num, rem , rev;
		num = a;
		rem = 0;
		rev = 0;
		
		while(num != 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		
		System.out.println("Reverse number is = " +rev);
	}
}