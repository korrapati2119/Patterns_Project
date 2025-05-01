package Queue;

/**
 * @author venkatakishorekorrapati
 */

// this class will implement comparable interface
public class Person implements Comparable<Person> {
	String name;
	String role;
	int priority;
	String message;
	
	// person class constructor
	public Person(String name, String role, int priority, String message) {
		super();
		this.name = name;
		this.role = role;
		this.priority = priority;
		this.message = message;
	}

	@Override // this method will override the compareTo method for priority queue
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.priority,this.priority);
	}

	@Override // to print the output
	public String toString() {
		return "[" + role + "] " + name + " (Priority: " + priority + ") - Message: " + message;	}
}
