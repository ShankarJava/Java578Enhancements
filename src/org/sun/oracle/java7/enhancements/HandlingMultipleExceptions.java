package org.sun.oracle.java7.enhancements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HandlingMultipleExceptions {

	public static void main(String[] args) {
		
			
		
		
		List<Integer> l = new ArrayList<>();
		
		BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Data.txt"));
            in.read();
            //AE
        } catch (IOException | ArithmeticException | NullPointerException | ClassCastException e) {
            e.printStackTrace();
        }
	}
}
