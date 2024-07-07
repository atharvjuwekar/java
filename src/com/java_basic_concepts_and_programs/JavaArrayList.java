package com.java_basic_concepts_and_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>(5);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		System.out.println(list);
		list.set(0, 99);
		System.out.println(list);
		System.out.println(list.contains(300));
		
		System.out.println("Get all values in ArrayList :");
		
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j)); // To get values using index, we can't do list[j] 
		}
	}

}
