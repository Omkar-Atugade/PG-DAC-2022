import java.util.*;

class HashMapMappingSpecifiedValues{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "AAAAAA");
		m1.put(2, "BBBBBB");
		m1.put(3, "CCCCCC");
		m1.put(4, "DDDDDD");
		m1.put(5, "EEEEEE");
		m1.put(6, "FFFFFF");
		m1.put(7, "GGGGGG");
		
		System.out.println("Elements in the hashmap are : ");
	
		Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
		
		for(Map.Entry<Integer, String> entry : s1){
		
			System.out.println(entry);
			
		}
       
		
		System.out.println("Enter the value you want to search : ");
		String n = sc.nextLine();
		
		Collection<String> v = m1.values();
		for(String k : v){
			
			if(k.equals(n)){
				System.out.println("Value found in the map.");
			}
			
		}
		
		
	}
}