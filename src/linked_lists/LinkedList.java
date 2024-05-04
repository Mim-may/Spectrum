package linked_lists;

public class LinkedList {
private Node head;

public LinkedList() {
	head = null;
}

public boolean isEmpty() {
	if (head == null) // notice the use of "==" sign NOT the "equals" method
		return true;
	else
		return false;
}
public void outputList() { // Outputting the elements of a linked list
	Node position = head;
	while (position != null) {
		System.out.println(position.getItem() + " " + position.getCount());
		position.getLink();
	}
}

public void addToStart(String itemName, int itemCount) { //Adding an item to the top of the linked list
	head = new Node(itemName, itemCount, head);
}

public boolean deleteHead() { // Deleting the head node
	if (head != null) {
		head = head.getLink();
	    return true;}
	    else
	    	return false;
}
public int size() { // Finding the size of a linked list
	int count = 0;
	Node position = head;
	
	while (position != null) {
		count++;
		position = position.getLink();
	}
	return count;
}
public Node find(String target) { //Finding an item in a linked list
	Node position = head;
	String itemAtPosition;
	
	while (position != null) {
		itemAtPosition = position.getItem();
		if (itemAtPosition.equals(target))
			return position;
		position = position.getLink();
	}
	return null;
}
public boolean contains(String target) {
	return (find(target) != null);
}

}
