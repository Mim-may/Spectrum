package linked_lists;

public class Double_Node {
private String item;
private Double_Node prev;
private Double_Node next;


public Double_Node() {
	prev = null;
	next = null;
	item = null;
}
public Double_Node(String newItem) {
	setItem(newItem);
	prev = null;
	next = null;
}

public Double_Node(String newItem, Double_Node nextValue) {
	setItem(newItem);
	prev = null;
	next = nextValue;
}
public Double_Node(String newItem, Double_Node prevValue, Double_Node nextValue) {
	setItem(newItem);
	prev = prevValue;
	next = nextValue;
}
public void setItem(String newItem) {
	item = newItem;
}
public void setPrev(Double_Node newPrev) {
	prev = newPrev;
}
public void setNext(Double_Node newNext) {
	next = newNext;
}
public String getItem() {
	return item;
}
public Double_Node getPrev() {
	return prev;
}
public Double_Node getNext() {
	return next;
}
/* public void outputListBackward() {
	Double_Node current = last;
	while (current != null) {
		System.out.println(current.getItem());
		current = current.getPrev();
	} 
} */

//Adding a node to the front of the list
/*Double_Node a = new Double_Node(itemName);
a.setNext(first);
first.setPrev(a);
first = a; */

//Removing a node from the front of the list
/* first = first.getNext();
 * first.setPrev(null);
 */

//Adding a node at the back of the list
/* Double_Node a = new Double_Node(itemName);
 * a.setPrev(last);
 * a.setNext(null);
 * last.setNext(a);
 * last = last.getNext(); 
 */

//Removing a node from the back of the list
/* last = last.getPrev();
 * last.setNext(null);
 */

//Inserting a node cases

//If a list is initially empty
/* first = last = new Double_Node(itemName , first);
 */

//Item is to be added to the beginning of the list
/* newItem.setNext(first);
 * first.setPrev(newItem);
 * first = newItem;
 */

//Item is to be inserted in the middle of the list
/*current = current.getNext();
 * 
 * newItem.setPrev(current.getPrev());
 * current.getPrev().setNext(newItem);
 * newItem.setNext(current);
 * current.setPrev(newItem);
 */

//The item is to be inserted at the end of the list
/* last.setNext(newItem);
 * newItem.setPrev(last);
 * last = newItem;
 */

//Removing cases

//The item to be deleted is at the top of the list
/* first = current.getNext();
 * first.setPrev(null);
 */

//The item to be deleted is in the middle of the list
/* current = current.getNext();
 * 
 * current.getPrev().setNext(current.getNext());
 * current.getNext.setPrev(current.getPrev()); 
 */
public int search(String target) {
	int pos = -1;
	char direction = 'f';
	Double_Node position = new Double_Node();
	
	if (target.charAt(0) < 'M')
		pos = 0;
	//	position = first;
	else
	{
	//	position = last;
		direction = 'b';
	}
	String itemAtPosition;
	while (position != null)
	{
		pos++;
		itemAtPosition = position.getItem();
		if (itemAtPosition.equals(target))
			break;
		if (direction == 'f')
			position = position.getNext();
		else
			position = position.getPrev();
	}
	if (direction == 'f')
		return pos;
	else
		return  0; //size() - pos - 1;
}

}
