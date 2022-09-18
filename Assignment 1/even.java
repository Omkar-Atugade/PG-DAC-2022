import java.lang.*;
import java.util.*;

class even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want to print the series = " );
		int n = sc.nextInt();
		
		int i;
		
		for( i = 2; i <= n; i = i + 2){
			System.out.println(i);
		}
	}
}