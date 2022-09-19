//        A
//      B   B
//    C   C   C
//  D   D   D   D
//E   E   E   E   E 
   

import java.lang.*;
import java.util.*;

class p13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i , j, alpha;
		alpha = 65;
		
		for( i = 1; i <= r; i++){
			
            for( j = i; j <= c; j++){
				System.out.print("  ");
				
			}
			for( j = 1; j <= i; j++){
				System.out.print("  "+(char)alpha);
				
			}
			
		System.out.println();
		alpha++;
			
		}     
		
	}
}