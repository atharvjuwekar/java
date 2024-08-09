package basic_programs;

import java.util.Arrays;

public class ChangeValueOfMainArrayUsingFunction {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 6, 8};
		changeArray(arr1);
		System.out.println(Arrays.toString(arr1));
		String str = "Test1";
		changeString(str);
		System.out.println(str);
		
		
		

	}
	
	static void changeArray(int[] array) {
		array[0] = 99; // *** If we make a change to the object via variable, same object will be  changed. ****
	}
	
	static void changeString(String str) {
		str = "Test2";   //*****Creating a new Object, Cannot modify Strings *****
	}


}
