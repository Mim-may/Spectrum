package linked_lists;

import java.util.Iterator;

public class Week8_Test {
public static void main(String[] args) {
	System.out.println("javA".matches("[a-zA-Z]*"));
	System.out.println("Jav4".matches("[a-zA-Z_\\s_\\D]"));
	System.out.println(" jav4".matches("[a-zA-Z_\\s_\\d]+"));
	
	for (int i = 2; i > -1; i--) {
		switch (i) {
		case 0:
			System.out.print("K");
		case 1:
			System.out.print("L");
	    default:
			System.out.print("M");
		}
	}
	String day_Of_Week = "Wednesday";
}
}
