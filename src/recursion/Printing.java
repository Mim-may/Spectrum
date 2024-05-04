package recursion;

import java.util.Scanner;

public class Printing {
	
	public static void recursive_Print(int num) {
		int count = num;
		if (count == 1) {
			System.out.println();
		}
		else
			recursive_Print(count - 1);
		    System.out.println(count + " ");
	}

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		System.out.println("Please input a number");
	//	int n = s.nextInt();
		//recursive_Print(n);

	}

}
