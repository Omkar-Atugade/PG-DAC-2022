import java.lang.*;
import java.util.*;

	class factorial{
		public static void main(String[] args){
			int i, f;
			f=1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			
			for(i=1;i<=n;i++){
				
				f = f*i;
			}
			System.out.println("Factorial of given number is = " +f);
		}	
		
	}