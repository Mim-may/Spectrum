package stacks;

public class Test {

	public static void main(String[] args) {
		Array_Stack s1 = new Array_Stack(10);
		Array_Stack s2 = new Array_Stack(10);
		
		for (int j = 0; j < 10; j++) {
			s1.push(j++);
		}
		s1.outputStack();
		s2.push(s1.top());
		s1.pop();
		s2.push(s1.top());
		s1.pop();
		s2.push(s1.top());
		s1.pop();
		System.out.println();
		s2.outputStack();
		System.out.println();
		s1.outputStack();
		//System.out.println(s1.top());
		//System.out.println(s2.top());

	}

}
