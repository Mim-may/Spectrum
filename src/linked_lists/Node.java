package linked_lists;

public class Node {
private String item;
private int count;
private Node link;


public Node() {
	item = "Null";
	count = 0;
	link = null;
}

public Node(String newItem, int newCount, Node link) {
	setData(newItem, newCount);
	this.link = link;
}

public String getItem() {
	return item;
}

public int getCount() {
	return count;
}

public Node getLink() {
	return link;
}

public void setData(String newItem, int newCount) {
	item = newItem;
	count = newCount;
}
public void setLink(Node newLink) {
	link = newLink;
}

}
