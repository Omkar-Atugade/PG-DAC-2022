import java.lang.*;
import java.util.*;

class lcm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int a = sc.nextInt();
		System.out.println("Enter the second number = ");
		int b = sc.nextInt();
		
		int i, lcm = 0 , gcd = 0 ;
		
		for( i = 1; (( i <= a ) && ( i <= b )); i++){
			if (( a % i == 0) && ( b % i == 0)){
				gcd = i;
			}
		}
		
	
		lcm = ( a * b )/ gcd;
		
		
		System.out.println("LCM of given numbers is  " +lcm);
		
	}
}