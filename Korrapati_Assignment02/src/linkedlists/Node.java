package linkedlists;
/**
 * @author venkatakishorekorrapati
 */

// Node class for student details
public class Node {
	int std_ID;
	String firstName;
	String lastName;
	boolean isGradOrNot;
	int age;
	Node next;
	
	// default constructor
	public Node() {
		
	}
	// Constructor to initialize a node with student details
	public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age) {
		super();
		this.std_ID = std_ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isGradOrNot = isGradOrNot;
		this.age = age;
	}
}
