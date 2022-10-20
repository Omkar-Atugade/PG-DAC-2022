import java.lang.*;
import java.util.*;

class Factorial{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find factorial of : ");
		int n = sc.nextInt();
		
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact*i;
		
		}
		System.out.println("Factorial of given number is = "+fact);
	}

}