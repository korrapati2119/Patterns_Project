package doublylist;
/**
 * @author venkatakishorekorrapati
 */
public class Node {
	// student details
	int std_ID;
	String firstName;
	String lastName;
	Boolean isGradOrNot;
	int age;
	// Reference to the next node 
	Node next;
	// Reference to the previous node
	Node previous;
	
	// Constructor to initialize the node with above student details
	public Node(int id,String fname,String lname,Boolean grad,int age)
	{
		std_ID=id;
		firstName=fname;
		lastName=lname;
		isGradOrNot=grad;
		this.age=age;
	}
}
