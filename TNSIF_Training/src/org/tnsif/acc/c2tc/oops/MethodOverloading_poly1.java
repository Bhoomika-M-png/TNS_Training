package org.tnsif.acc.c2tc.oops;
class Addition{
	void add(int a1,int a2) {
		System.out.println("sum of first 2 numbers:"+(a1+a2));
	}
	void add(int n1,double n2,int n3) { //diff datatypes
		System.out.println("sum of second 3 numbers:"+(n1+n2+n3));
	}
}

public class MethodOverloading_poly1 {
	public static void main (String[]args) {
		Addition obj=new Addition();
		obj.add(10,20);
		obj.add(11,22.2,3);
		
		
	}

}
