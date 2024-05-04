package recursion;

import java.util.Scanner;

public class Recursive_ArraySum {
	
	public static int Array_Sum(int A[], int N) {
			if (N <= 0)
				return 0;
			return (Array_Sum(A, N - 1) + A[N - 1]);
}
	public static int factorial(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Array_Sum(arr, arr.length));
	//	Scanner s = new Scanner(System.in);
		System.out.println("Please input a number");
	//	int x = s.nextInt();
	//	System.out.println(factorial(x));

	}

}
