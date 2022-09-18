import java.lang.*;
import java.util.*;

class primeFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int n = sc.nextInt();
		
		int num, i;
		num = n;
		
		for(i = 2; i < num; i++){
			while( num % i == 0 ){
				System.out.print(i+" ");
				num = num / i;
			}
		}
		if ( num > 2 ){
			System.out.println(num);
		}
		
		
	}
}