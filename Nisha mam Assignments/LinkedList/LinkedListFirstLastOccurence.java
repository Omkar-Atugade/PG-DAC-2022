import java.lang.*;
import java.util.*;

class LinkedListFirstLastOccurence{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("AAAAAA");
		l1.add("BBBBBB");
		l1.add("CCCCCC");
		l1.add(new String("AAAAAA"));
		l1.add("EEEEEE");
		l1.add(new String("AAAAAA"));
		l1.add("GGGGGG");
		l1.add(new String("BBBBBB"));
		
		System.out.println("Elements in the linked list 1 are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
	
		System.out.println("Enter the element you want to check : ");
		String s = sc.nextLine();
		
		int a = l1.indexOf(s);
		int b = l1.lastIndexOf(s);
		
		System.out.println("First occurrence of element in the list is at index  : "+a);
		System.out.println("Last occurrence of element in the list is at index : "+b);
		
	}
}