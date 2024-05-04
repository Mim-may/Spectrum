package stacks;

public class LinkedStackTest {

	public static void main(String[] args) {
		LinkedStack a = new LinkedStack();
		a.push(11);
		a.push(13);
		a.push(25);
		a.push(12);
		a.push(14);
		System.out.println("a:");
		a.outputLinkedStack();
		System.out.println(a.top());
		a.pop();
		System.out.println("a:");
		a.outputLinkedStack();
		
		LinkedStack x = new LinkedStack();
		x.push(23);
		x.push(56);
		x.push(20);
		x.push(12);
		x.push(10);
		x.push(22);
		LinkedStack b = new LinkedStack();
		b.copyStack(x);
		System.out.println("b:");
		b.outputLinkedStack();
		System.out.println(a.equals(x));
		System.out.println(b.equals(x));

	}

}
