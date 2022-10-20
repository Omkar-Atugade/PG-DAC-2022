import java.lang.*;
import java.util.*;

class HashSetConversionToArrayList{
	
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
		
		List<String> l1 = new ArrayList<String>();
		for(String s : s1){
			
			l1.add(s);
		}
		
		System.out.println("Elements in the array list are : ");
		for(String a : l1){
			
			System.out.println(a);
			
		}
	}
}