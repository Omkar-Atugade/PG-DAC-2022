import java.lang.*;
import java.util.*;

class positiveNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check = ");
		float n = sc.nextFloat();
		
		if ( n > 0 ){
		
			System.out.println("Number is a positive number");
		}
		else{
			System.out.println("Number is a negative number");
		}
		
	}
}