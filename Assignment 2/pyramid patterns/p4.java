//                                1
//                              1 2 3
//                            1 2 3 2 1  
//                          1 2 3 4 3 2 1     
//                        1 2 3 4 5 4 3 2 1   
//                      1 2 3 4 5 6 5 4 3 2 1   
//                    1 2 3 4 5 6 7 6 5 4 3 2 1       
//                  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1    
//                1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1


import java.lang.*;
import java.util.*;

class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want = ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns you want = ");
		int c = sc.nextInt();
		
		int i, j, count = 1;
		
		for( i = 1; i <= r; i++){
            for( j = i; j<= c; j++){
				System.out.print("  ");		
			}
			for( j = 1; j <= i; j++){
				System.out.print(j+" ");		
			}
			for( j = count-1; j >= 1; j--){
				System.out.print(j+" ");		
			}
		System.out.println();
        count++;	
		}
	}
}