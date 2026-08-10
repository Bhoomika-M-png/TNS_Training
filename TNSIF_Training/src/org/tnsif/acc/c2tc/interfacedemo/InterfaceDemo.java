package org.tnsif.acc.c2tc.interfacedemo;
class SmartLight implements SmartDevice{

@Override
public void turnOn() {
	System.out.println("Phone is Turn ON");
	
}

@Override
public void turnOff() {
	System.out.println("Phone is Turn OFF");
}
	

@Override
public void getStatus() {
	System.out.println("Get Status of phone");
}
public class InterfaceDemo {
	public static void main(String[]args) {
		SmartDevice smart=new SmartLight();
		smart.turnOn();
		smart.turnOff();
		smart.getStatus();
		
	}
}

}


