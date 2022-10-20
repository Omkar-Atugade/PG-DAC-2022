import java.lang.*;
import java.util.*;

class MathOperation{
	
	
	public static int add(int a , int b){
		
		int addition = a + b;
		return addition;
	}
	
	public static int subtract(int c, int d){
		int subtraction = 0;
		if(c > d){
			subtraction = c - d;
		}
		else{
			subtraction = d - c;
		}
		return subtraction;
	}
	
	public static int multiply(int e, int f){
		
		int mul = e * f;
		return mul;
	}
	
	public static int power(int g, int h){
		
		int p = (int)(Math.pow(g, h));
		
		return p;
	}
}

class DemoOfOperations{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();
		
		
		int a = MathOperation.add(n1, n2);
		System.out.println("Addition of two numbers is : "+a);
		
		int s = MathOperation.subtract(n1, n2);
		System.out.println("Subtraction of two numbers is : "+s);
		
		int m = MathOperation.multiply(n1, n2);
		System.out.println("Multiplication of two numbers is : "+m);
		
		int p = MathOperation.power(n1, n2);
		System.out.println("Power : "+p);
	}
	
}