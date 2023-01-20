package org.oracle.sun.java5.enhancements;

class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
}

public class MyCalculator extends Calculator {
	
	@Override
	public int add(int a, int b) {

		return a + b;
	}
}
