import java.lang.*;
import java.util.*;

class ArmstrongBetweenNumbers{

	public static boolean armstrong(int x){
		
		int num, rem = 0, sum = 0, digit = 0;
		num = x;
		
		while(num > 0){
			
			num = num / 10;
			digit = digit + 1;
			
		}
		
		num = x;
		while(num != 0){
			rem = num % 10;
			sum = sum + (int)(Math.pow(rem, digit));
			num = num / 10;
		}
		if(sum == x){
			return true;
		}
		else{
			return false;
		}
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit till you want armstrong numbers : ");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++){
			
			if(armstrong(i)){
				System.out.println(i+" ");
			}
		}
		
	}
	
	
}