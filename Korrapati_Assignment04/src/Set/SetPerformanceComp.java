package Set;
/**
 * @author venkatakishorekorrapati
 */
import java.util.*;

public class SetPerformanceComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//different input sizes for testing sets performances
		
		testWithSize(1000);
		testWithSize(10000);
		testWithSize(100000);
	}
		public static void testWithSize(int size) {
			
			//creating sets 
			
			Set<Integer> hashSet = new HashSet<>();
			Set<Integer> linkedHashSet = new LinkedHashSet<>();
			Set<Integer> treeSet = new  TreeSet<>();
			
			//this will generate random numbers to insert elements into sets
			Random random = new Random();
			
			//variables for storing startTime and endTime
			long startTime, endTime;
			//measuring the time for inserting elements into hashSet
			startTime = System.nanoTime();
			for(int i=0;i < size; i++) {
				hashSet.add(random.nextInt());
				
			}
			endTime = System.nanoTime();
			System.out.println("Time taken for hashset: "+(endTime - startTime)+ "ns");
			
			//measuring the time for inserting elements into linkedHashSet
			startTime = System.nanoTime();
			for(int i = 0; i < size; i++) {
				linkedHashSet.add(random.nextInt());
			}
			endTime = System.nanoTime();
			System.out.println("Time taken for linkedHashSet: "+(endTime - startTime)+ "ns");
			
			//measuring the time for inserting elements into treeSet
			startTime = System.nanoTime();
			for(int i=0; i < size; i++) {
				treeSet.add(random.nextInt());
			}
			endTime = System.nanoTime();
			System.out.println("Time taken for treeSet: " +(endTime - startTime)+ "ns");

			System.out.println("**********************************");
		}
	}
//As the size of the data increases, the performance differences between the three sets become more apparent. 
//The HashSet performs the fastest due to its use of hash buckets for quick lookups and no need to maintain element order. 
//The LinkedHashSet, which maintains insertion order using a linked list, is slightly slower than HashSet but still efficient for moderate-sized datasets. 
//The TreeSet, which maintains sorted order, is the slowest as it involves additional overhead for sorting elements. 
//As the number of elements grows, the time taken by the TreeSet increases significantly, whereas HashSet and LinkedHashSet maintain relatively stable performance.