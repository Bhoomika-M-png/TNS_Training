package org.tnsif.acc.c2tc.oops;
class User{
	String name;
	int age;
	//default constructor
	
	User(){
		name="Bhoomi";
		System.out.println("Welcome");
		
	}

}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		User user=new User();
		System.out.println(user.name+" " +user.age);
		

	}

}
