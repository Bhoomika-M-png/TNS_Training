package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

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
		
		payment=new UpiPayment();
		payment.makePayment();
		
		payment=new CardPayment();
		payment.makePayment();
		
		payment=new WalletPayment();
		payment.makePayment();	

	}

}

