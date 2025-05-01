package Hashing;
/**
 * @author venkatakishorekorrapati
 */
import java.util.*;
public class HashDriver {

	//to count no of collisions
		static int collision = 0;
		static int arraySize = 31;
		//list of list of type integer for chaining
		static List<List<Integer>> hashTable = new ArrayList<>(arraySize);
		// this set will contain unique random numbers
		static Set<Integer> set = new HashSet<>();
		
		//initialize hash table with empty linked list at each index
		public static void arrayInitialize() {
			for(int i = 0; i < arraySize; i++) {
				hashTable.add(new LinkedList<>());
				
			}
		}
		
		//hashing function using for collision resolution
		public static void hashing (int val) {
			
			//hash index calculation 
			int index = val % arraySize;
			if (!hashTable.get(index).isEmpty()){
			//if it is not empty then the collision count will be increased
			collision++;
		}
			
			//adding value to the linked list at index
		hashTable.get(index).add(val);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Random random = new Random();
			
			arrayInitialize();
			//generating 1000 unique random numbers and inserting into hash table
			for(int i = 0; i < 1000;) {
				int num = random.nextInt(10000);
				if(set.add(num)) {
					hashing(num);
					i++;
				}
			}
			System.out.println("Total number of collisions: " + collision);
	        printHashTable();
		}
		//printing data in hash table
		 public static void printHashTable() {
		        for (int i = 0; i < arraySize; i++) {
		            System.out.println("Index " + i + ": " + hashTable.get(i));
		        }
		    }
}

//The results show that using a small hash table (size 31)for 1000 unique numbers leads to frequent collisions due to the 
//modulus operation (val % 31) mapping multiple values to the same index. 
//Chaining efficiently handles these collisions by storing multiple values in linked lists, preventing data loss. 
//However, the high number of collisions indicates that the hash function does not distribute values uniformly. 
//A larger prime-sized table or an improved hash function could reduce collisions and improve performance.
