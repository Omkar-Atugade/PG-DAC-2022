import java.lang.*;
import java.util.*;

class SortingStringBasedOnLength23{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string you want to enter : ");
		int n = sc.nextInt();
		
		String str[] = new String[n];
		System.out.println("Enter the strings : ");
		sc.nextLine();
		for(int i = 0; i < str.length; i++){
			
			str[i] = sc.nextLine();
		}
		
		int x[] = new int[str.length];
		for(int i = 0; i < str.length; i++){
			
			String s = str[i];
			x[i] = s.length();
		}
		
		String sorted[] = new String[str.length];
		for(int i = 0; i < sorted.length; i++){
			for(int j = 0; j < sorted.length; j++){
				
				String s1 = str[j];
				if(x[i] == s1.length()){
					
					sorted[i] = str[j];
				}	
			}
		}
		
		System.out.println("Strings after sorted according to their length : ");
		for(int i = 0; i < sorted.length; i++){
			
			System.out.println(sorted[i]);
		}
	}
}