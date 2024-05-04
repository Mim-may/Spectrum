package linked_lists;

public class Linked_List {
private Node_ first;
private Node_ last;

public Linked_List() {
	first = null;
	last = null;
}
public boolean isEmpty() {
	return (first == null);
}
public void insertAtFront(String itemName) { //Insert a node at the head of the linked list
	if (isEmpty())
		first = last = new Node_(itemName, first);
	else
		first = new Node_(itemName,first);
		
}
public boolean removeFromFront() { //Remove the first element in the linked list
	if (isEmpty()) {
		System.out.println("The list is empty!");
		return false;
	}
	else
	{ 
		if (first == last)
			first = last = null;
		else
			first = first.getLink();
		return true;
	}

}
public void insertAtBack(String itemName) { //Insert a node at the end of the list
	if (isEmpty())
		first = last = new Node_(itemName, first);
	else
	{
		last.setLink(new Node_(itemName));
		last = last.getLink();
	}
}
public boolean removeFromBack() { // Deleting the last element of the list
	if (isEmpty()) {
		System.out.println("The list is empty!");
		return false;
	}
	else {
		if (first == last) 
			first = last = null;
		else {
			Node_ current = first;
			while(current.getLink() != last)
				current = current.getLink();
			last = current;
			current.setLink(null);
		}
     return true;
	}
}
public int size() { // Finding the size of a linked list
	int count = 0;
	Node_ current = first;
	
	while (current != null) {
		count++;
		current = current.getLink();
	}
	return count;
}
public void outputList() { // Outputting the elements of a linked list
	Node_ current = first;
	while (current != null) {
		System.out.println(current.getItem() + " " + current.getItem());
		current.getLink();
	}
}
public Node_ find(String target) { //Finding an item in a linked list
	Node_ position = first;
	String itemAtPosition;
	
	while (position != null) {
		itemAtPosition = position.getItem();
		if (itemAtPosition.equals(target))
			return position;
		position = position.getLink();
	}
	return null;
}
public boolean contains(String item) {
	return (find(item) != null);
}
}
