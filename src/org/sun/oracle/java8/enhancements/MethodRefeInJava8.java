package org.sun.oracle.java8.enhancements;

class MRTest{
	public  void jump() {
		for (int i = 0; i < 5; i++) {
			System.out.println("USerdefined Thread invoked");
		}
	}	
}

class MyThread extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("USerdefined Thread invoked");
		}
	}
}
public class MethodRefeInJava8 {
	
	public static void main(String[] args) {
	
		MRTest mrt = new MRTest();
		
		Runnable r= mrt::jump;
		
		Thread t1 = new Thread(r);
		t1.start();
	}

}
