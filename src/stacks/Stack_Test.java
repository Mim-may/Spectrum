package stacks;

public class Stack_Test {
public static void main(String[] args) {
	Array_Stack s = new Array_Stack(3);
	s.push(10);
	s.push(15);
	s.push(12);
	s.push(7);
	s.outputStack();
	s.pop();
	System.out.println("Top:" + s.top());
	s.outputStack();
	
	Array_Stack x = new Array_Stack(6);
	x.push(23);
	x.push(56);
	x.push(12);
	x.push(45);
	x.push(10);
	x.push(22);
	s.copyStack(x);
	System.out.println("Change: ");
	s.outputStack();
	Array_Stack y = new Array_Stack(x);
	System.out.println(s.equals(x));
	System.out.println(s.equals(s));
	x.outputStack();
	y.outputStack();
}
}
