import java.lang.*;
import java.util.*;

class addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int a = sc.nextInt();
		System.out.println("Enter the second number = ");
		int b = sc.nextInt();
		
		int i;
		int sum = a;
		for ( i = 0; i < b; i++){
			sum++ ;
		}
		
		System.out.println("Sum of " +a+ " and " +b+ " is " +sum);
		
	}
}