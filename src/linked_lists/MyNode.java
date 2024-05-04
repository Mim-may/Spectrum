package linked_lists;

public class MyNode {
private Student student;
public MyNode next;

public MyNode(Student student) {
	this.student = student;
}
public MyNode() {
	
}
public Student getStudent() {
	return student;
}

}
