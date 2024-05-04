package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Array_Stack {
private int[] stackArray;
private int size;
private int top;

public Array_Stack(int newSize) {
	if (newSize <= 0)
		size = 10;
	else
		size = newSize;
	stackArray = new int[size];
	top = 0;
}

public Array_Stack() {
	size = 10;
	stackArray = new int[size];
	top = 0;
}
public Array_Stack(Array_Stack otherStack) {
	copyStack(otherStack);
}
public void initializeStack() {
	top = 0;
}

public boolean isEmpty() {
	return (top == 0);
}
public boolean isFull() {
	return (top == size);
}
public boolean push(int newItem) {
	if(!isFull()) {
		stackArray[top] = newItem;
		top++;
		return true;
	}
	else
		return false;
}
public boolean pop() {
	if (!isEmpty()) {
		top--;
		return true;
	}
	else
		return false;
}
public int top() {
	assert(top == 0);//terminate the program if the stack is empty
	return stackArray[top - 1];
}
public void copyStack(Array_Stack newStack) {
	size = newStack.size;
	top = newStack.top;
	stackArray = new int [size];
	for (int i = 0; i < top; i++) {
		stackArray[i] = newStack.stackArray[i];
		}
}
public boolean equals(Array_Stack otherStack) {
	if (size != otherStack.size)
		return false;
	else
		for (int i = 0; i < size; i++) 
			if (stackArray[i] != otherStack.stackArray[i])
				return false;
			return true;
			}
public void outputStack() {
	if (top != 0)
		for (int i = 0; i < top - 1; i++) {
			System.out.println(stackArray[i]);
			
		}
}
public static void main(String[] args) {
	Array_Stack a = new Array_Stack(10);
	int x,i = 2;
	Scanner s = new Scanner(System.in);
	a.push(5);
	x = s.nextInt();
	while (x != -999) {
		if (x * i % 3 == 0) {
			if (!a.isFull())
				a.push(x);
			i++;
		}
		else if (x * i % 3 == 1) {
			a.pop();
			i--;
		}
		else
			System.out.println("x = " + x);
		x = s.nextInt();
		}
	System.out.println("Stack Elements:");
	while (!a.isEmpty()) {
		System.out.println(a.top);
		a.pop();
		
		Array_Stack s1 = new Array_Stack(10);
		Array_Stack s2 = new Array_Stack(10);
		
		for (int j = 0; j < 10; j++) {
			s1.push(j++);
		}
		s2.push(s1.top());
		s1.pop();
		s2.push(s1.top());
		s1.pop();
		s2.push(s1.top());
		s1.pop();
		
		System.out.println(s1.top());
		System.out.println(s2.top());
		
		
		
	}
}

}
