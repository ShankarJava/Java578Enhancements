package org.oracle.sun.java7.enhancements;

import java.io.FileInputStream;
import java.io.IOException;

public class ResourceOutsideTry {

	public static void main(String[] args) throws IOException {
		
		    FileInputStream input = new FileInputStream("file.txt");
////		    try(input) {
////
////		        int data = input.read();
////		        while(data != -1){
////		            System.out.print((char) data);
////		            data = input.read();
////		        }
//		    }
//		}
	}
}
