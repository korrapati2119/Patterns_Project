package linkedlists;
/**
 * @author venkatakishorekorrapati
 */

public class SinglyLinkedList {
	// this method will insert new nodes at the end of the linked list
	public Node insertNode(Node head, Node k) {
		if(head == null) {
			head = k;
		}
		else {
			Node abc = head;
			while(abc.next!= null) {
				abc = abc.next;
			}
			abc.next = k;
		}
			return head;
	}
	// this method will update students graduation details based on the student id
	public Node updateDetails(Node head, int sid) {
		Node v = head;
		while(v != null) {
			if (v.std_ID == sid) {
	            v.isGradOrNot = !v.isGradOrNot;
	            break;
	        }
	        v = v.next; 
		}
		return head;
	}
	
	// this method will print student details
	public void print(Node head) {
		if(head == null) {
			return;
		}
			System.out.println("The student ID is: " +head.std_ID);
			System.out.println("First Name: "+head.firstName);
			System.out.println("Last Name: "+head.lastName);
			System.out.println("isGraduated: "+head.isGradOrNot);
			System.out.println("Age: "+head.age);
			System.out.println("******");
			print(head.next);
	}
	
	// this method will swap two nodes in the list based on their student ids
	public Node swap(Node head, int stdid1, int stdid2) {
		if(head == null || stdid1 == stdid2) {
			return head;
		}
	    Node prev1 = null, prev2 = null, n1 = head, n2 = head;
	    while(n1 != null & n1.std_ID != stdid1) {
	    	prev1 = n1;
	    	n1 = n1.next;
	    }
	    while(n2 != null && n2.std_ID != stdid2) {
	    	prev2 = n2;
	    	n2 = n2.next;
	    }
	    if(n1 == null || n2 == null) {
	    	return head;
	    }
	    if(prev1 != null) {
	    	prev1.next = n2;
	    }
	    else {
	    	head = n2;
	    }
	    if(prev2 != null) {
	    	prev2.next = n1;
	    }
	    else {
	    	head = n1;
	    }
	    Node temp = n1.next;
	    n1.next = n2.next;
	    return head;
	}
	
	// this method will merge two lists by adding second list to the end of the second list
	public Node merge(Node head_1, Node head_2) {
		Node v = head_1;
		while(v.next != null) {
			v = v.next;
		}
		v.next = head_2;
		return head_1;
	}
}