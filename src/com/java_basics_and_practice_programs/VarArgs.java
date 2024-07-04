package com.java_basics_and_practice_programs;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		multipleArgs(1, 2 ,3);
		multipleDifferentArgs(1, 3, "abc", "xyz");
	}

	static void multipleArgs(int ...vars) {
		System.out.println(Arrays.toString(vars));
	}
	
	static void multipleDifferentArgs(int a, int b, String ...strs) { //Variable argument should be always in the end
	
	}
}
