package org.sun.oracle.java5.enhancements;

enum Direction{
	NORTH, SOUTH, EAST, WEST
}

enum Month{
	JANUARY, FEBRUARY, MARCH, 
}
enum Season{
	SUMMER, WINTER, RAINY
}

public class TypeSafeEnumsInjava5 {
	public static void main(String[] args) {
		
//		String direction ="North";
//		System.out.println(direction);
//		direction ="James";
//		System.out.println(direction);
		
		Direction direction = Direction.EAST;
		 direction = Direction.WEST;
		//direction ="James";
		
		
		
	}

}
