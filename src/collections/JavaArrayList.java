package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {

	public static void main(String[] args) {
		
		
//		Delclairations
		
		ArrayList myList = new ArrayList();
//		myList = new ArrayList();
//		ArrayList<Integer> myList = new ArrayList<Integer>();
		
//		adding elements
		myList.add(100);
		myList.add("A");
		myList.add(100.5);
		myList.add("Welcome");
		myList.add(null);
		myList.add(100);
		myList.add(null);
		
//		inserting element
		myList.add(2, "Hi");
		
//		get element
		myList.get(2);
		
//		delete element
		myList.remove(2);
		
		
//		Reading arraylists
		System.out.println(myList);
		
//		Reading individual item from ArrayList
//		Normal for loop
		System.out.println("Print ArrayList using normal for loop:");
		for (int i = 0; i < myList.size(); i++ ) {
			System.out.println(myList.get(i));
		}
		
//		advance for loop or for each loop
		System.out.println("Print ArrayList using advanced for loop:");
		for (Object item : myList) {
			System.out.println(item);
		}
		
//		Iterator 
		System.out.println("Print ArrayList using iterator:");
		Iterator it = myList.iterator();
//		Iterator<Object> it = myList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		check if ArrayList is empty
		System.out.println(myList.isEmpty());


		
//		remove all elements which are in another ArrayList2 from ArrayList1
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add("Welcome");
		
		myList.removeAll(myList2);
		
		System.out.println(myList);
		
//		clear all elements from ArrayList
		myList.clear();
		
		System.out.println(myList);
		System.out.println(myList.isEmpty());
		
	}
}
