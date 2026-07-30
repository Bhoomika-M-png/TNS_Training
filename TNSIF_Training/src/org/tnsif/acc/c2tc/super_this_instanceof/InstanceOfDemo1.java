package org.tnsif.acc.c2tc.super_this_instanceof;

class Person5{
	
}
class Employee extends Person5{
	
}
class Manager extends Employee{
	
}

public class InstanceOfDemo1 {

	public static void main(String[] args) {
		Person5 person=new Person5();
		Employee emp=new Employee();
		Manager man=new Manager();
		System.out.println(emp instanceof Employee);//t
		System.out.println(emp instanceof Person5);//t
		System.out.println(emp instanceof Manager);//t
	}

}
