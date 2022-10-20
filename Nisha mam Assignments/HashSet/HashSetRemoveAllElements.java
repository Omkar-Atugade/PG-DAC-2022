import java.lang.*;
import java.util.*;

class HashSetRemoveAllElements{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> s1 = new HashSet<String>();
		s1.add("FFFFFF");
		s1.add("AAAAAA");
		s1.add("HHHHHH");
		s1.add("CCCCCC");
		s1.add("BBBBBB");
		s1.add("DDDDDD");
		s1.add("EEEEEE");
		s1.add("GGGGGG");
		
	
		System.out.println("Elements in the hashset are : ");
		for(String x : s1){
			
			System.out.println(x);
			
		}
		
		s1.clear();
		
		System.out.println("Elements in the hashset after removal operation are : ");
		for(String a : s1){
			
			System.out.println(a);
			
		}
	}
}