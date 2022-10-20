import java.lang.*;
import java.util.*;

class NumberTable{
	public static void table(int s){
		

		for(int i = 1; i <= 10; i++){
			
			int n = s * i;
			System.out.println(s+" * "+i+" = "+n);	
			
		}	
	}		

	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		
		table(x);
		
	}
}