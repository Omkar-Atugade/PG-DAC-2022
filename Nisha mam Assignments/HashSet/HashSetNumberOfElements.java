import java.lang.*;
import java.util.*;

class HashSetNumberOfElements{
	
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
		
		
		int count = 0;
		
		System.out.println("Elements in the set are : ");
		for(String x : s1){
			
			System.out.println(x);
			count++;
		}
		
		System.out.println("Total number of elements in the set : "+count);
		
	}
}