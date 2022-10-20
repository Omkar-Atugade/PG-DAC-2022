import java.lang.*;
import java.util.*;

class Fibonacii{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of series : ");
		int n = sc.nextInt();
		
		int n1 , n2 , n3;
		n1 = 0;
		n2 = 1;
		
		System.out.print(n1+ " " + n2);
		
		for(int i = 0; i < n - 2; i++){
			
			n3 = n1 + n2;
			System.out.print(" "+n3);
			
			n1 = n2;
			n2 = n3;
			
		}
	}
}