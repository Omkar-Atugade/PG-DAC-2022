// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


import java.lang.*;
import java.util.*;

class p17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i , j, count = 1;
		
		for( i = 1; i <= r; i++){
            
			for( j = 1; j <= i; j++){
				System.out.print("  "+count);
				count++;
			}
			
		System.out.println();
		
			
		}     
		
	}
}