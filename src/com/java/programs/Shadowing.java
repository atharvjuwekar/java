package com.java.programs;

public class Shadowing {
	static int x = 90;
	public static void main(String[] args) {
		System.out.println(x);
		int x = 30;
		System.out.println(x);
		fun();
	}
	
	static void fun() {
		int x = 40;
		System.out.println(x);
	}

}
