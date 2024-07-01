package java_practice_programs;

import java.util.Arrays;

public class FunctionOverloading {
	public static void main(String[] args) {
		fun(68);
		fun("Test");
		fun(1,2);
		fun(1,2,3);
		fun(1,2,3,4,5);
	}
	
	static void fun( int a) {
		System.out.println(a);
	}
	
	static void fun(String str) {
		System.out.println(str);
	}

	static void fun( int a, int b) {
		System.out.println(a + " " +b);
	}
	
	static void fun( int a, int b, int c) {
		System.out.println(a + " " +b+ " "+c);
	}
	
	static void fun(int ...vars) {
		System.out.println(Arrays.toString(vars));
	}
}
