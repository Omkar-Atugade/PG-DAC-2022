//        A
//      A   B
//    A   B   C
//  A   B   C   D
//A   B   C   D   E  

import java.lang.*;
import java.util.*;

class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j, alpha;
		
		for( i = 1; i <= r; i++){
			alpha = 65;
			for( j = i; j <= c; j++){
				System.out.print("  ");	
			}
			for( j = 1; j <= i; j++){
				System.out.print("  "+(char)alpha);
				alpha++;
			}
			
		System.out.println();
		
			
		}    
		
	}
}