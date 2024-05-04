package linked_lists;

public class Node_ {
private String item;
private Node_ link;

public Node_() {
	item = null;
	link = null;
}
public Node_(String newItem) {
	item = newItem;
	link = null;
}

public Node_(String newItem, Node_ linkValue) {
	setItem(newItem);
	link = linkValue;
}
public void setItem(String newItem) {
	item = newItem;
}
public void setLink(Node_ newLink) {
	link = newLink;
}
public String getItem() {
	return item;
}
public Node_ getLink() {
	return link;
}

}
