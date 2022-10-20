import java.lang.*;
import java.util.*;

class ArrayListOfMovies{
	
	public static void main(String args[]){
		
		ArrayList<String> m1 = new ArrayList<String>();
		m1.add("AAAAAA");
		m1.add("BBBBBB");
		m1.add("CCCCCC");
		m1.add("DDDDDD");
		m1.add("EEEEEE");
		m1.add("FFFFFF");
		m1.add("GGGGGG");
		m1.add("HHHHHH");
		
		System.out.println("Movies in the array list are : ");
		for(String x : m1){
			
			System.out.println(x);
		}
	}
}