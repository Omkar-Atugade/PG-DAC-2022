// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
   

import java.lang.*;
import java.util.*;

class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j;
		
		for( i = 1; i <= r; i++){
		
			for( j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
		System.out.println();
		}
        
	}
}