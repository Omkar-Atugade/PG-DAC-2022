import java.lang.*;
import java.util.*;

class ExactPrimeNumber{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want : ");
		int n = sc.nextInt();
		
		int count = 0, num = 1, i;
		while(count < n){
			
			num = num + 1;
			for (i = 2; i <= num ; i++){
				
				if(num % i == 0){
					break;
				}
			}
			if(i == num){
				count = count + 1;
			}
		}
		System.out.println(num);
	}
}