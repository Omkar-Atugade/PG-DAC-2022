//        5
//      4   5
//    3   4   5
//  2   3   4   5
//1   2   3   4   5 

import java.lang.*;
import java.util.*;

class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i , j, count;
		
		for( i = r; i >= 1; i--){
			count = i;
			for( j = 1; j < i; j++){
				System.out.print("  ");	
			}
			for( j = c; j >= i; j--){
				System.out.print(count+"  ");
				count++;
			}
			
		System.out.println();
			
		}     
		
	}
}