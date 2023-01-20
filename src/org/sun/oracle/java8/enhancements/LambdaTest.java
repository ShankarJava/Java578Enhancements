package org.sun.oracle.java8.enhancements;

public class LambdaTest {

	public static void main(String[] args) {

		II a1 = () -> System.out.println("Method m1 invoked");

		a1.m1();
	}
}
