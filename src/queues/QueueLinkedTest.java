package queues;

public class QueueLinkedTest {
public static void main(String[] args) {
	Linked_Queue q = new Linked_Queue();
	String x,y;
	x = "Hi";
	y = "Bye";
	q.addQueue(x);
	q.addQueue(y);
	x = q.getFront();
	q.deleteQueue();
	q.addQueue(x + "Maya");
	q.addQueue("Hello");
	q.addQueue(x);
	q.addQueue(y);
	q.outputQueue();
	
	Linked_Queue n = new Linked_Queue();
	int i, j;
	for (i= 0; i < 3; i++) {
		for (j = 7; j > 0; j -= 2) {
			//n.addQueue(i * j % 5);
			if (i * j % 3 == 0)
				q.deleteQueue();
		}
		q.outputQueue();
		
	}
}
}
