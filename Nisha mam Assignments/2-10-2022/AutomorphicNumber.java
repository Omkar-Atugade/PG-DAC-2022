//automorphic number is number who come in the last digits of its square
//for example:
//            5 = 25
//            6 = 36
//           25 = 625




import java.lang.*;
import java.util.*;

class AutomorphicNumber{

	public static boolean automorphic(int x){
		int num, rem=0, sq=0;
		num = x;
		
		sq = num * num ;
		
		while(num > 0){
			
			int a = num %10;
			int b = sq % 10;
			if(a != b ){
				
				return false;
			}	
			num = num / 10;
			sq = sq / 10;
			
		}
		return true;
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
			
		boolean i = automorphic(n);
		if(i){
			System.out.println("Number is automorphic.");
		}
		else{
			System.out.println("Number is not automorphic.");
		}
	}
}