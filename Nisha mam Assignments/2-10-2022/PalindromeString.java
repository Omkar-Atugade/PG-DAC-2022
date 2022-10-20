import java.lang.*;
import java.util.*;

class PalindromeString{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to check : ");
		String x = sc.nextLine();
		
		String original, reverse = "";
		original = x;
		
		int length = original.length();
		
		for(int i = length-1; i >= 0; i--){
			
			reverse = reverse + original.charAt(i);
		}
		
		if(x.equals(reverse)){
			System.out.println("Given string is palindrome.");
		}
		else{
			System.out.println("Given string is not a palindrome.");
		}
	}
}