//         *
//       * *
//     *   *
//   *     *
// * * * * *


import java.lang.*;
import java.util.*;

class p16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j;
		
		for( i = 1; i <= r; i++){
            for( j = i; j<= c; j++){
				System.out.print("  ");	
				
			}
			
			for( j = 1; j <= i; j++){
				if ( i == r || j == i || j == 1){
					System.out.print("* ");
									
				}
				else {
				System.out.print("  ");			
			    }
			}	
		System.out.println();	
		}
	}	
}