package org.sun.oracle.java7.enhancements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesManagement {
	
	public static void main(String[] args) {
		
		
		try  (Scanner scanner = new Scanner(new File("C:/Users/91879/Desktop/Java class/Data.txt"))){
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		}
	}

}
