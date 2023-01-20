package org.sun.oracle.java7.enhancements;

public class StringInSwitchInJava7 {

	public static void execute(String command) {
		
		//int  sal = 10_00_000;
		
		switch (command) {
		
		case "START":
			System.out.println("Starting ...");
			break;
		case "STOP":
			System.out.println("Stopping ...");
			break;
		case "REWIND":
			System.out.println("Rewinding ...");
			break;
		case "FORWARD":
			System.out.println("Forwarding ...");
			break;
		case "PAUSE":
			System.out.println("Pausing ...");
			break;
		case "SHUTDOWN":
			System.out.println("Shutting down ..");
			System.exit(0);
			break;
		default:
			System.out.println("Unknown Command");
		}
	}
public static void main(String[] args) {
	StringInSwitchInJava7 s = new StringInSwitchInJava7();
	s.execute("START");
}
}
