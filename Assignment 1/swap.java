import java.lang.*;
import java.util.*;

class swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second number = ");
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Numbers after swapping are a = "+a+ " and b = "+b);
		
	}
}