package Queue;

/**
 * @author venkatakishorekorrapati
 */
import java.util.*;

public class PriorityQueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating priority queue
		PriorityQueue<Person> pqueue = new PriorityQueue<>();
		
		// adding persons to pqueue
		pqueue.add(new Person ("Prof.Johnson", "Faculty",4,"Submit grades"));
		pqueue.add(new Person ("Alice","Student",1,"Need help with assignment"));
		pqueue.add(new Person ("Dr. Smith","Faculty",3,"Schedule meeting for research"));
		pqueue.add(new Person ("David","Staff",2,"Organize department event"));
		pqueue.add(new Person ("Charlie","Student",1,"Request for leave"));
		pqueue.add(new Person ("Bob","Staff",2,"Fix the lab computer"));
		
		//printing persons 
		System.out.println("Processing messages in priority order: ");
		while(!pqueue.isEmpty()) {
			System.out.println(pqueue.poll());
		}
	}

}
