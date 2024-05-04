package recursion;

import java.util.ListIterator;
import java.util.Stack;

public class Stack_Sorting {
	
	static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
 
        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
 
        // Put back the top item removed earlier
        s.push(temp);
    }
 
    // Method to sort stack
    static void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty()) {
            // Remove the top item
            int x = s.pop();
 
            // Sort remaining stack
            sortStack(s);
 
            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }
 
    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
    
    public static void linear_search(int[] arr, int target) {
    	boolean flag = false;
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				flag = true;
			}
    	}
    	String result =  flag == true ? "Element found" : "Element was not found";
    	System.out.println(result);
			}
		
    public static int binary_search(int[] arr, int first, int last, int target) {
    	if (last >= first)
		{
			int mid = first +(last-1)/2;
			
			if(arr[mid] == target)
				return mid;
			if(arr[mid] > target)
				return binary_search(arr, first, mid-1, target);
			return binary_search(arr, mid+1, last , target);
		}
		return -1;

    }
    


	public static void main(String[] args) {
	    Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
 
        System.out.println(
            "Stack elements before sorting: ");
        printStack(s);
 
        sortStack(s);
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
        
        int[] a = {1,5,20,35,50,65,70};
        linear_search(a, 50);
        int result = binary_search(a, 0, 6, 50);
        System.out.println(result);

	}

}
