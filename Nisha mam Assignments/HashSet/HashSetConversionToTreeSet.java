import java.lang.*;
import java.util.*;

class HashSetConversionToTreeSet{
	
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
		
		Set<String> s2 = new TreeSet<String>();
		for(String s : s1){
			
			s2.add(s);
		}
		
		System.out.println("Elements in the treeset are : ");
		for(String a : s2){
			
			System.out.println(a);
			
		}
	}
}