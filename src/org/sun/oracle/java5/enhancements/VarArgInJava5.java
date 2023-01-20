package org.sun.oracle.java5.enhancements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.lang.Math.PI;
import static java.lang.Math.max; 
public class VarArgInJava5 {

	static String firstOfFirst(List<String>... strings) {
		List<Integer> ints = Collections.singletonList(42);
		Object[] objects = strings;
		objects[0] = ints; // Heap pollution

		return strings[0].get(0); // ClassCastException
	}

	public static void main(String[] args) {
		// VarArgInJava5 va = new VarArgInJava5();
		// String one = firstOfFirst(Arrays.asList("one", "two"),
		// Collections.emptyList());

		// assertEquals("one", one);
	}

}

class Calculatorr {
	int add(int... a) {

		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		return total;

	}

	public static void main(String[] args) {
		Calculatorr c1 = new Calculatorr();
		System.out.println(c1.add(2, 3));
		System.out.println(c1.add(20, 30, 40));
		System.out.println(c1.add(200, 300, 400, 500));
		System.out.println(c1.add(2, 3, 4, 5, 5, 6, 7, 8, 9));
		
		System.out.println(PI*5*5);
		System.out.println(max(2,3));

	}
}
