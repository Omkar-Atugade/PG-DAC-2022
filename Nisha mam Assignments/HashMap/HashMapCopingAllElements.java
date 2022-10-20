import java.util.*;

class HashMapCopingAllElements{
	
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
		
		System.out.println("Elements in the hashmap 1 are : ");
	
		Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
		
		for(Map.Entry<Integer, String> entry : s1){
		
			System.out.println(entry);
			
		}
		
		HashMap<Integer, String> m2 = new HashMap<Integer, String>();
		
		 m1.forEach((key, value) -> {
            
                m2.put(key, value);
          
        });
 
        
		
		System.out.println("Elements in the hashmap 2 are : ");
	
		Set<Map.Entry<Integer, String>> s2 = m2.entrySet();
		
		for(Map.Entry<Integer, String> entry : s2){
		
			System.out.println(entry);
			
		}
		
	}
}