import java.lang.*;
import java.util.*;

class ArrayListRetrievalFromGivenPosition{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("111111");
		l1.add("222222");
		l1.add("333333");
		l1.add("444444");
		l1.add("555555");
		l1.add("666666");
		l1.add("777777");
		l1.add("888888");
		
		System.out.println("Elements in the array list are : ");
		for(String x : l1){
			
			System.out.println(x);
		}
		
		System.out.println("Enter the index of element you want : ");
		int n = sc.nextInt();
		
		String s = l1.get(n);
		
		System.out.println("Element at index "+n+" is : "+s);
		
	}
}