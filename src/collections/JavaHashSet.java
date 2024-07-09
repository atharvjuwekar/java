package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaHashSet {
	
	public static void main(String[] args) {
		
//		Declairation
		
		HashSet mySet = new HashSet();
//		Set myset = new HashSet();
//		HashSet<String> mySet = new HashSet<String>();
		
		mySet.add(100);
		mySet.add("A");
		mySet.add(100.5);
		mySet.add("Welcome");
		mySet.add(null);
		mySet.add(true);
		mySet.add(100);
		mySet.add(null);
		
//		Printing all HashSet
		System.out.println(mySet);
		
//		Removing values
		mySet.remove(100);
		
		System.out.println(mySet);
		
//		Insertion is not possible
//		Accessing specific element is not possible
		
//		Convert HashSet into ArrayList
		
		ArrayList list = new ArrayList(mySet);
		
		System.out.println(list.get(2));
		
//		Reading individual elements from HashSet
//		Normal for loop is not possible as it does not has index
		
		System.out.println("Using advanced for loop printing set");
		for(Object x : mySet) {
			System.out.println(x);
		}
		
		System.out.println("Using iterator printing set");
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		clearing set
		mySet.clear();
		
		  
	}

}
