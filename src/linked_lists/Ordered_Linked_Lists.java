package linked_lists;

public class Ordered_Linked_Lists {
private Node_ first;
private Node_ last;

public Ordered_Linked_Lists() {
	first = null;
	last = null;
}
public boolean isEmpty() {
	return (first == null);
}
public void insert(String itemName) {
	if (isEmpty())
		first = last = new Node_(itemName,first);
	else 
	{
		Node_ newItem = new Node_(itemName);
		Node_ current = first;
		Node_ prev = new Node_();
		
		while (current != null) {
			if (current.getItem().compareTo(itemName) > 0)
			{   //If the item is to be inserted at the beginning of the list
				if (current == first)
				{
					newItem.setLink(first);
					first = newItem;
					break;
				}
				else
				{   //If the item is to be inserted somewhere in the middle of the list
					prev.setLink(newItem);
					newItem.setLink(current);
					break;
				}
				
			}
			else if (current == last) {
				// If the item is to be inserted at the end of the list
				last.setLink(newItem);
				newItem.setLink(null);
				last = newItem;
			} //The below is for traversing the list
			prev = current; 
			current = current.getLink();
		}
	}
}
public boolean remove(String itemName) {
	if (isEmpty())
	{
		System.out.println("The list is empty!");
		return false;
	}
	else
	{
		Node_ current = first;
		Node_ prev = new Node_();
		while (current != null) 
		{
			if (current.getItem().equals(itemName))
			{
				if (current == first)
				{
					first = current.getLink();
					return true;
				}
				else
				{
					prev.setLink(current.getLink());
					return true;
				}
			}
			prev = current;
			current = current.getLink();
		}
		System.out.println(itemName + " is not in the list!");
		return false;
	}
}
public int size() {
	int count = 0;
	Node_ current = first;
	
	 while (current != null) {
		 count++;
		 current = current.getLink();
	 }
	 return count;
}
public void OutputList() {
	Node_ current = first;
	while (current != null) {
		System.out.println(current.getItem());
		current = current.getLink();
	}
}
public boolean search(String target) {
	Node_ position = first;
	String itemAtPosition;
	while (position != null) {
		itemAtPosition = position.getItem();
		if (itemAtPosition.equals(target))
			return true;
		position = position.getLink();
	}
	return false;
}
public int search_(String target) {
	int pos = -1;
	Node_ position = first;
	String itemAtPosition;
	while (position != null)
 {
	pos++;
	itemAtPosition = position.getItem();
	if (itemAtPosition.equals(target))
		return pos;
	position = position.getLink();
 }
	return pos;
 }
}
