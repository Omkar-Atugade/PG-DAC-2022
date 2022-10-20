import java.lang.*;
import java.util.*;

class Loops{

	public static void main(String args[]){
		
		int i;
		System.out.print("For loop :");
		for(i= 20; i >= 1; i--){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int j = 20;
		System.out.print("While loop :");
		while(j >= 1){
			System.out.print(j+" ");
			j--;
		}
		
		System.out.println();
		
		int k = 20;
		System.out.print("Do while loop :");
		do{
		
			System.out.print(k+" ");
			k--;
		}while(k >= 1);
		
		
		
	}
}