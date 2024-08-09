package oops;

public class PolymorphismMain {

	public static void main(String[] args) {

		Polymorphism obj = new Polymorphism(); //#1
//		Polymorphism obj = new Polymorphism(1,2,3); //#2
//		Polymorphism obj = new Polymorphism(1); //#3
		
		obj.printVars();
		System.out.println(add(2,3));
		
//		Que. Can we overload main method?
//		Ans. Yes
		
		PolymorphismMain overload = new PolymorphismMain();
		overload.main("John");
		overload.main(12);
	}
	
	void main(String a) {
		System.out.println(a);
	}
	void main(int a) {
		System.out.println(a);
	}
//	 #1
	static int add( int num1, int num2){
		return num1 + num2;
	}
	
//	#2
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
