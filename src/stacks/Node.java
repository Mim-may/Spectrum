package stacks;

public class Node {
private int info;
private Node link;

public Node() {
	link = null;
	info = 0;
}
public Node(int newInfo) {
	setInfo(newInfo);
	link = null;
}
public int getInfo() {
	return info;
}
public Node getLink() {
	return link;
}
public Node(int newInfo, Node linkValue) {
	setInfo(newInfo);
	link = linkValue;
}
public void setInfo( int newInfo) {
	info = newInfo;
}
public void setLink(Node newLink)
{
	link = newLink;
}
}
