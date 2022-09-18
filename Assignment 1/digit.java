import java.lang.*;
import java.util.*;

class digit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		
		String string_n = Integer.toString(n);
		
		for (int i = 0 ; i < string_n.length(); i++){
			
			System.out.println(string_n.charAt(i));
		}
		
		
	}
}