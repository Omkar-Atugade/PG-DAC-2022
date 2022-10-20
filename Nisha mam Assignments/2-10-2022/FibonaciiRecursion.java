import java.lang.*;
import java.util.*;

class FibonaciiRecursion{

    static int n1 = 0 , n2 = 1, n3;
		
	static void fibonacci(int x){
	
		if(x > 0){
			n3 = n1 + n2;
			System.out.print(" "+n3);
				
			n1 = n2;
			n2 = n3;
				
			fibonacci(x-1);	
		}
				
	}
			
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of series : ");
		int n = sc.nextInt();
		
		System.out.print(n1+ " " + n2);
		fibonacci(n-2);
	}
}