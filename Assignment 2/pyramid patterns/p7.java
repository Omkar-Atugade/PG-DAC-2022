//  9 9 9 9 9 9 9 9 9 
//   8 8 8 8 8 8 8 8
//    7 7 7 7 7 7 7
//     6 6 6 6 6 6
//      5 5 5 5 5 
//       4 4 4 4 
//        3 3 3
//         2 2
//          1


import java.lang.*;
import java.util.*;

class p7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j, count;
		count = c;
		for( i = 1; i <= r; i++){
			
			for( j = 1; j <= i; j++){
				System.out.print("  ");
			}
	        for( j = i; j <= c; j++){
				System.out.print(" "+count+"  ");
			}
		System.out.println();
		count--;
		}
	}
	
} 