package queues;

import linked_lists.Node_;

public class Linked_Queue {
private Node_ front;
private Node_ rear;

public Linked_Queue() {
	front = null;
	rear = null;
}
public boolean isEmpty() {
	return (front == null);
}
public void initializeQueue() {
	front = null;
	rear = null;
}
public String getFront() {
	assert(front != null);
	return front.getItem();
}
public String getRear() {
	assert(rear != null);
	return rear.getItem();
}
public void addQueue(String newElement) {
	Node_ a = new Node_(newElement);
	if (front == null) 
		front = rear = a;
	else {
		rear.setLink(a);
		rear = rear.getLink();
		}
	}
public void deleteQueue() {
	if (isEmpty())
		System.out.println("Queue is empty.");
	else {
		front = front.getLink();
		if (front == null)
			rear = null;
	}
}
public void outputQueue() {
	if (!isEmpty()) {
		Node_ c = new Node_();
		c = front;
		while (c != null) {
			System.out.println(c.getItem());
			c = c.getLink();
		}
	}
}

	}


