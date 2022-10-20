import java.lang.*;
import java.util.*;

class LinkedListIsEmpty{
	
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
		
	
		LinkedList<String> l2 = new LinkedList<String>();
		
		if(l1.isEmpty()){
			
			System.out.println("Linked list 1 is empty.");
		}
		else{
			
			System.out.println("Linked list 1 is not empty.");
		}
		
		if(l2.isEmpty()){
			
			System.out.println("Linked list 2 is empty.");
		}
		else{
			
			System.out.println("Linked list 2 is not empty.");
		}
	}
}