// 5
// 5  4  
// 5  4  3  
// 5  4  3  2  
// 5  4  3  2  1


import java.lang.*;
import java.util.*;

class p16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j, count;
		
		
		for( i = 1; i <= r; i++){
			count = c;
			
			for( j = 1; j <= i; j++){
				System.out.print(count+"  ");
				count--;
			}
			
		System.out.println();
		
			
		}     
		
	}
}