// 1  2  3  4  5
// 1  2  3  4
// 1  2  3  
// 1  2
// 1


import java.lang.*;
import java.util.*;

class p14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j, count;
		
		
		for( i = 1; i <= r; i++){
			count = 1;
			
			for( j = i; j <= c; j++){
				System.out.print(count+"  ");
				count++;
			}
			
		System.out.println();
		
			
		}     
		
	}
}