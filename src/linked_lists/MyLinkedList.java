package linked_lists;

public class MyLinkedList {
private MyNode root;
private int size;

public MyLinkedList() {
	root = null;
	size = 0;
}
public void addStudent(Student student) {
	 MyNode newNode = new MyNode(student);
 if (root == null) {
	 root = newNode;
 }
 else {
	 MyNode current = root;
	 while (current.next != null) 
		 current = current.next;
	 
	 current.next = newNode;
	 size++;
 }
	 
}
public void searchGPA(double gpa) {
	MyNode position = root;
	while (position != null) {
		if (position.getStudent().getGpa() > gpa)
			System.out.println(position.getStudent());
		position = position.next;
	}
}
public void printData() {
	MyNode position = root;
	while (position.next != null) {
		System.out.println(position.getStudent().toString());
		position = position.next;
	}
}
public void addStudentToFront(Student student) {
	MyNode newNode = new MyNode(student);
	if (root == null) {
		root = newNode;
	    root.next = null; }
	else {
		newNode.next = root;
		root = newNode;
	}
	size++;
		
}
public MyNode addStudentToGivenPosition(MyNode root, int position, Student data) {
	MyNode target = new MyNode(data);
	MyNode prev = new MyNode();
	MyNode current = root;
	int counter = 0;
	if (root == null)
	return null;
	else {
		while (current != null) {
			if (counter == position) {
				if (counter == 0 && root != null) {
					target.next = root;
					root = target;
					break;
				}
				else {
					prev.next = target;
					target.next = current;
					break;
				}
			}
			prev = current;
			current = current.next;
			counter++;
		}
		size++;
		return target;
	}
}
public void deleteStudent(Student student) {
	MyNode target = new MyNode(student);
	MyNode current = root;
	MyNode previous = new MyNode();
	if (current == null) {
		System.out.println("The list is empty.");
	}
	else {
		while (current != null) {
		if (current.getStudent().equals(target)) {
			if (current == root) {
				root = root.next;
			}
			else {
				previous.next = current.next;
			}
		}
		previous = current;
		current = current.next;
	}
		size--;
	}
}
}
