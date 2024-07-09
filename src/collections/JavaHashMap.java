package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class JavaHashMap {
	
	public static void main(String[] args) {
		
//		Declairation
//		HashMap myMap = new HashMap();
//		Map myMap = new HashMap();
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
//		Adding pairs to hashmap
		
		myMap.put(101, "John");
		myMap.put(102, "Mary");
		myMap.put(103, "Scott");
		myMap.put(104, "Devid");
		myMap.put(105, "John");
		myMap.put(106, "Tony");
		myMap.put(107, "Scott");
//		myMap.put(103, "John");
		
		System.out.println(myMap);
		
//		Get size
		myMap.size();
		
//		Get value
		myMap.get(102);
		
//		remove pair
		myMap.remove(103);
		
//		insert values
		myMap.put(103, "Scott");
		
//		get all keys, values
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		
//		get keys along with values
		System.out.println(myMap.entrySet());
		
//		reading data from HashMap
//		Normal for loop is not possible as it does not has index
		
		System.out.println("Using advance for loop:");
		for (int k : myMap.keySet()) {
			System.out.println("Key : " + k + "Value : " + myMap.get(k));
		}
		
		System.out.println("Using iterator:");
		Iterator<Entry<Integer, String>>  itr = myMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
