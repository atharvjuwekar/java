package oops;

public class Encapsulation {
	
//	Encapsulation means wrapping up data and methods in single unit(class)
//	
//	It has 3 rules
//	1. All variables should be private
//	2. For every variable there should be 2 methods (get & set)
//	3. Variables can be operated only through the methods
	
	private int accntNo;
	private String name;
	private double amount;
	
	public int getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(int accntNo) {
		this.accntNo = accntNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}
