package HashPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashFunction {

	
	public static int HashFunction(String key) {
		
		
		int Hashval= Math.abs(key.hashCode());
		int index=  Hashval%7;
		
    	return index;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String str1="Hello";
//		String str2= "Mohit";
//		String str3= "Tea";
//		
//		System.out.println(HashFunction(str1));
//		System.out.println(HashFunction(str2));
//		System.out.println(HashFunction(str3));
////		System.out.println(HashFunction(str));
		
		
		
		HashMap<String, Integer> hm= new HashMap();
		
		// adding the data
		hm.put("Mohan", 45);
		
		hm.put("Sohan", 67);
		hm.put("Aman", 34);
		
		System.out.println(hm);
		
		
		System.out.println(hm.containsKey("Mohit"));
		
		// Key ->value)
		System.out.println(hm.get("Mohan"));
		System.out.println(hm.get("Mohit"));	
		System.out.println(hm.getOrDefault("Mohan", -10));
		System.out.println(hm.getOrDefault("Mohit", -10));
		
		hm.remove("Mohan");
		System.out.println(hm.containsKey("Mohan"));
		System.out.println(hm);
		
		hm.put("Amit", 40);
		System.out.println(hm);
		
		
		// array
//		int [] arr= {1,2,3,4,5,6};
//		
//		for( int val : arr) {
//			System.out.println(val);
//		}
		
		System.out.println(hm.keySet());
		
		for( String keys: hm.keySet()) {
			
			System.out.println(keys + "-> "+ hm.get(keys));
		}
		
		for( int val : hm.values()) {
			System.out.println(val);
		}
		
		
		for (  Map.Entry<String, Integer> e: hm.entrySet()) {
			
			System.out.println(e.getKey()+ "- > "+ e.getValue());
		}
		
		
		
		
		
		
		
	}

}
