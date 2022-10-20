import java.lang.*;
import java.util.*;

class ClassCategory{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int n = sc.nextInt();
		
		
		if(n >= 80){
			System.out.println("You passed with Distinction.");
		}
		
		else if (n >= 60 && n < 80){
				System.out.println("You passed with First class.");
		}	
		
		else if (n >= 40 && n < 60){
				System.out.println("You passed with Second class.");
		}
		
	    else{
				System.out.println("You are failed.");
		
		}
			
		
	}
}