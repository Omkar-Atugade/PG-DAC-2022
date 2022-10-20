import java.lang.*;
import java.util.*;

class LinkedListReplaceElement{
	
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
		
		
		System.out.println("Enter the element you want to insert : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the index where you want to put element : ");
		int n  = sc.nextInt();
		
		l1.set(n, s);
		
		System.out.println("Elements in the linked list are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
	}
}