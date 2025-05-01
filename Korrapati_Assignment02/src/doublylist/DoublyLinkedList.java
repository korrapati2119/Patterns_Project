package doublylist;
/**
 * @author venkatakishorekorrapati
 */
public class DoublyLinkedList {
	public Node insertNode(Node head,Node v)
	{
		// if the list is null then the new node is the head
		  if (head == null) {
		        head = v;
		    } else {
		    	// this will traverse to the last node in the list
		        Node std = head;
		        while (std.next != null) {
		            std = std.next;
		        }
		        // it will set the new node as the next node of the last node in the list
		        std.next = v;
		        // it will set the previous pointer of the new node to the last node
		        v.previous = std;  
		    }
		    return head;
	}
	// this will print the doubly linked list
	public void print(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println("The student ID is: "+temp.std_ID);
			System.out.println("First Name: "+temp.firstName);
			System.out.println("Last Name: "+temp.lastName);
			System.out.println("isGraduated: "+temp.isGradOrNot);
			System.out.println("Age: "+temp.age);
			System.out.println("******");
			
			// moving to the next node
			temp = temp.next;
		}
	}
	
	// this method is used to reverse the existing doubly linked list
	public void reverseList(Node head)
	{
		if(head == null)
		{
			return;
		}
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		// it will print the reversed linked list
		while(temp != null) {
			System.out.println("The student ID is: "+temp.std_ID);
			System.out.println("First Name: "+temp.firstName);
			System.out.println("Last Name: "+temp.lastName);
			System.out.println("isGraduated: "+temp.isGradOrNot);
			System.out.println("Age: "+temp.age);
			System.out.println("******");
			temp = temp.previous;
		}
	}
}
