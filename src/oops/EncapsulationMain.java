package oops;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation acc = new Encapsulation();
		
		acc.setAccntNo(122);
		acc.setName("John");
		acc.setAmount(20000);
		
		System.out.println(acc.getAccntNo());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
	}
	
}
