package recursion;

import java.util.Scanner;

public class Reverse_Printing {
	
	public static void reverse_Print(int num) {
		int count = num;
		if (count == 1) {
			System.out.println(1);
		}
		else {
			System.out.println(count);
			reverse_Print(count - 1);
		}
	}

	public static void main(String[] args) {
     //  Scanner s = new Scanner(System.in);
       System.out.println("Please input a number");
 //      int x = s.nextInt();
   //    reverse_Print(x);
	}

}
