package org.sun.oracle.java8.enhancements;

interface I {
	default public void m1() {
		System.out.println("Welcome to default methods in java 8");
	}
}

class A implements I {

}

public class DMInJava8 {
	
	public static void main(String[] xyz) {
		I i = new A();
		i.m1();
	}

}
