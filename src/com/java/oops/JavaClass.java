package com.java.oops;

public class JavaClass {
	
	public static void main(String[] args) {
		
		Student atharv = new Student();
		//construction overloading
		Student atharvConstOverloaded = new Student(12, "Juwekar", 80.4f);
		
		System.out.println(atharv.rno);
		System.out.println(atharvConstOverloaded.marks);
		
		atharv.greeting();
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


