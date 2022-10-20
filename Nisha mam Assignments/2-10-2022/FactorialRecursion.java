import java.lang.*;
import java.util.*;

class FactorialRecursion{

	
	public static int factorial(int x){
		
		if (x >= 1){
			x = x * factorial(x-1);
			return x;
		}
		else{
			return 1;
		}
		
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find factorial of : ");
		int n = sc.nextInt();
		
		int i = factorial(n);
		System.out.println("Factorial of given number is = "+i);
	}

}