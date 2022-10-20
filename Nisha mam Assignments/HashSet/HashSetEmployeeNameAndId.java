import java.lang.*;
import java.util.*;

class HashSetEmployeeNameAndId{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> s1 = new HashSet<String>();
		s1.add("AAAAAA");
		s1.add("BBBBBB");
		s1.add("CCCCCC");
		s1.add("DDDDDD");
		s1.add("EEEEEE");
		s1.add("FFFFFF");
		s1.add("GGGGGG");
		s1.add("HHHHHH");
		
		System.out.println("Name of the employees in the set are : ");
		for(String x : s1){
			
			System.out.println(x);
		}
		
		
		HashSet<Integer> s2 = new HashSet<Integer>();
		s2.add(123);
		s2.add(234);
		s2.add(345);
		s2.add(456);
		s2.add(567);
		s2.add(678);
		s2.add(789);
		s2.add(890);
		
		System.out.println("Id of the employees in the set are : ");
		for(Integer x : s2){
			
			System.out.println(x);
		}
		
		
		System.out.println("Enter the name of the employee you want to add in the set : ");
		String s = sc.nextLine(); 
		
		s1.add(s);
		
		System.out.println("Name of the employees in the set are : ");
		for(String a : s1){
			
			System.out.println(a);
		}
		
		System.out.println("Enter the Id of the employee you want to add in the set : ");
		int n  = sc.nextInt();
		
		for(Integer b : s2){
			
			System.out.println(b);
		}
		

	}
}