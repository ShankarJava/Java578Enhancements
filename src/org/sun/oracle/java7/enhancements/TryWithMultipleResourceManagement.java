package org.sun.oracle.java7.enhancements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithMultipleResourceManagement {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(new File("C:/Users/91879/Desktop/Java class/Data.txt"));
			    PrintWriter writer = new PrintWriter(new File("C:/Users/91879/Desktop/Java class/testData.txt"))) {
			    while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	}
}
