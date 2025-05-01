package linkedlists;
/**
 * @author venkatakishorekorrapati
 */
import java.util.*;

public class ListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating an instance of the singly linked list 
		SinglyLinkedList studentsList = new SinglyLinkedList();
		Scanner std = new Scanner(System.in);
		Node head = null;
		
		// getting student records and inserting into the linked list
		for(int i=0; i<5; i++) {
			
			System.out.println("Enter student ID: ");
			int id = std.nextInt();
			std.nextLine();
			System.out.println("Enter first name: ");
			String stdfirstname = std.nextLine();
			System.out.println("Enter last name: ");
			String stdlastname = std.nextLine();
			System.out.println("Enter student is graduated?: ");
			boolean graduate = std.nextBoolean();
			System.out.println("Enter student age: ");
			int age = std.nextInt();
			
			// creating a new node and insert it into the linked list
			Node k = new Node(id, stdfirstname, stdlastname, graduate, age);
			head = studentsList.insertNode(head, k);
			System.out.println();
		}
		
		// printing the details of all students in the list
        System.out.println("******************************************");
        System.out.println("Student Details are: ");
        studentsList.print(head);
        
        // this will update the student details
        for(int i=0;i<2;i++)
        {
        System.out.print("Enter the student ID you want to update: ");
        int id=std.nextInt();
        std.nextLine();
        System.out.print("Is the student graduated: ");
        boolean kvk = std.nextBoolean();
        Node head1 =studentsList.updateDetails(head, id);
        System.out.println("******************************************");
        System.out.println("After updating "+id+" details:");
        studentsList.print(head1);
        }
        
        // this will swap two students in the list
        Node s = studentsList.swap(head, 3, 5);
        System.out.println("Linked List after swapping 3 with 5 is ");
        studentsList.print(s);
        System.out.println("******************************************");
        System.out.println("After swapping the student: ");
        studentsList.print(head);
        
        // create and merge another linked list of students
        SinglyLinkedList secondStudentsList = new SinglyLinkedList();
        Node head2 =null;
        System.out.println("******************************************");
        System.out.println("Reading inputs for second linked list: ");
        for (int i = 0; i < 3; i++) {
        	// enter student details for second linked list
            System.out.print("Enter student ID: ");
            int id = std.nextInt();
            std.nextLine();
            System.out.print("Enter first name: ");
            String firstname = std.nextLine();
            System.out.print("Enter last name: ");
            String lastname = std.nextLine();
            System.out.print("Enter student is graduated?: ");
            boolean graduate = std.nextBoolean();
            System.out.print("Enter student age: ");
            int age = std.nextInt();
            Node newNode = new Node(id, firstname, lastname, graduate, age);
            head2 = secondStudentsList.insertNode(head2, newNode);
        }
        // merge the two lists and print the merger list
        System.out.println("Linked List after merging is");
        System.out.println("******************************************");
        System.out.println("After merging the two linked list: ");
        Node merginghead =studentsList.merge(head, head2);
        studentsList.print(merginghead);
std.close();
	}

}