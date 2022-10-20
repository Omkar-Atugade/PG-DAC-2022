import java.lang.*;
import java.util.*;

class LinkedListSearchingElement{
	
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
		
		System.out.println("Elements in the linked list 1 are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
		System.out.println("Enter the element you want to search : ");
		String s = sc.nextLine();

		if(l1.contains(s)){
			
			System.out.println("Element found in the linked list.");
		}
		
		else{
			
			System.out.println("Element is not found in the linked list.");
		}
	
		
	}
}