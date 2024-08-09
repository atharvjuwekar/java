package oops;

public class Polymorphism {
	
//	Polymorphism means single thing can have multiple forms.
//	It has 4 rules applicable
//	1. Method names should be same
//	2. Number of parameters should be different
//	3. Data type of parameters should be different
//	4. Order of parameters should be different

	
	int a;
	int b;
	int c;
	
	Polymorphism(){
		a = b = c = 0;
	}
	
	Polymorphism(int a, int b, int c){
		a = 4;
		b = 5;
		c = 0;
	}
	
	Polymorphism(int num){
		a = b = c = num;
	}
	
	void printVars() {
		System.out.println("a: "+a+" b: "+b+" c :"+c);
	}

}
