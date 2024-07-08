package com.java.oops;

public class JavaClassAndthisKeyword {
	
	public static void main(String[] args) {
		
		Student atharv = new Student();
		//construction overloading
		Student atharvConstOverloaded = new Student(12, "Juwekar", 80.4f);
		
		System.out.println(atharv.rno);
		System.out.println(atharvConstOverloaded.marks);
		
		atharv.greeting();
		
		Student one = new Student();
		Student two = one;
		
		one.name = "Testname";
		System.out.println(one.name + two.name);
	}
	
}

class Student{
	
	int rno;
	String name;
	float marks;
	
	Student(){
		this.rno = 21;
		this.name = "Atharv";
		this.marks = 90.4f;
		
	}
	
	Student(int rno, String name, float marks){
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		
	}
	
	void greeting() {
		System.out.println("Hello my name is " + this.name);
	}
	
//	Student(){
//		this (13, "Atharv", 85.4f);
//	}
	
}


