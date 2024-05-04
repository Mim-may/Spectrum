package recursion;

import linked_lists.Node;

public class Delete_LinkedList {
	
	public static void delete_List(Node head) {
         if (head == null)
        	 return;
         delete_List(head.getLink());
         System.gc();
	}

	public static void main(String[] args) {

	}

}
