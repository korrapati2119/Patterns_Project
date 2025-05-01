package doublylist;
/**
 * @author venkatakishorekorrapati
 */
import java.util.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an instance for the doubly linked list
		DoublyLinkedList doublylinkedlist=new DoublyLinkedList();
		Scanner std = new Scanner(System.in);
        Node head = null;
        
        // looping for until 6 students
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter student ID: ");
            int id = std.nextInt();
            std.nextLine();
            System.out.print("Enter first name: ");
            String stdfirstname = std.nextLine();
            System.out.print("Enter last name: ");
            String stdlastname = std.nextLine();
            System.out.print("Enter student is graduated?: ");
            boolean graduate = std.nextBoolean();
            System.out.print("Enter student age: ");
            int age = std.nextInt();
            
            // creating a new node with student details
            Node newNode = new Node(id, stdfirstname, stdlastname, graduate, age);
            head = doublylinkedlist.insertNode(head, newNode);
        }
        
        // print the list in normal order
        System.out.println("******************************************");
        System.out.println("Doubly Linked List:");
        doublylinkedlist.print(head);
        System.out.println("******************************************");
        
        System.out.println("**********************************");
        
        // print the list in reverse order
        System.out.println("The linked list printed in reverse order is");
        doublylinkedlist.reverseList(head);
        std.close();
	}

}
