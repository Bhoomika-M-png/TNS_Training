package org.tnsif.acc.c2tc.oops;

class Payment{
	void makePayment() {
		System.out.println("Processing payment using generic method");
	}
}
class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("Payment is done using UPI ");
	}
}
class CardPayment extends Payment{
	void makePayment() {
		System.out.println("payment is made using credit/debit card");
	}
}
class WalletPayment extends Payment{
	void makePayment() {
		System.out.println("payment is done via wallet");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Payment payment;//reference parent class
		
		payment=new UpiPayment();//runtime polymorphism
		payment.makePayment();
		
		payment=new CardPayment();//runtime polymorphism
		payment.makePayment();
		
		payment=new WalletPayment();//runtime polymorphism
		payment.makePayment();	

	}

}

