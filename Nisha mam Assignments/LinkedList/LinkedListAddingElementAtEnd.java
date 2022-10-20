import java.lang.*;
import java.util.*;

class LinkedListAddingElementAtEnd{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("AAAAAA");
		l1.add("BBBBBB");
		l1.add("CCCCCC");
		l1.add("DDDDDD");
		l1.add("EEEEEE");
		l1.add("FFFFFF");
		l1.add("GGGGGG");
		l1.add("HHHHHH");
		
		System.out.println("Elements in the linked list are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
		System.out.println("Enter the elements you want to add in the linked list : ");
		String s = sc.nextLine();
		
		l1.add(s);
		
		System.out.println("Updated linked list is : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
	}
}