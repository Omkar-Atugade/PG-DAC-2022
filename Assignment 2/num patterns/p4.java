// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5




import java.lang.*;
import java.util.*;

class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j;
		
		for( i = 1; i <= r; i++){
			
			for( j = 1; j <= i; j++){
				System.out.print(i+" ");
			
			}
		System.out.println();
		}
        
	}
}