import java.lang.*;
import java.util.*;

class LinkedListJoiningTwoList{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("AAAAAA");
		l1.add("BBBBBB");
		l1.add("CCCCCC");
		l1.add("DDDDDD");
		
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("EEEEEE");
		l2.add("FFFFFF");
		l2.add("GGGGGG");
		l2.add("HHHHHH");
		
		System.out.println("Elements in the linked list 1 are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
		System.out.println("Elements in the linked list 2 are : ");
		for(String x : l2){
			
			System.out.println(x);
		}
	
		l1.addAll(l2);
		
		System.out.println("linked list is after joining two list : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
	}
}