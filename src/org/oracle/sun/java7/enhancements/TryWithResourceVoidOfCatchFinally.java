package org.oracle.sun.java7.enhancements;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceVoidOfCatchFinally {
	public static void main(String[] args) throws IOException {

	    try(FileInputStream input = new FileInputStream("C:/Users/91879/Desktop/Java class/Data.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	
}
