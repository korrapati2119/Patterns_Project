package Trees;

/**
 * @author venkatakishorekorrapati
 */
public class Korrapati_Assignment05 {
	    static class Node {
	        int k1, k2, k3;
	        Node left, right, horizontal;
	        

	        public Node(int k1, int k2, int k3) {
	            this.k1 = k1;
	            this.k2 = k2;
	            this.k3 = k3;
	            
	        }

	        @Override
	        public String toString() {
	            return "(" + k1 + "-" + k2 + "-" + k3 + ")";
	        }
	    }

	    static class ThreeDTree {
	        Node root;

	        public ThreeDTree() {
	            root = null;
	        }

	        public void insertValue(int k1, int k2, int k3) {
	            root = insertRecVal(root, k1, k2, k3);
	        }

	        private Node insertRecVal(Node root, int k1, int k2, int k3) {
	            if (root == null) {
	                return new Node(k1, k2, k3);
	            }

	            if (k1 == root.k1) {
	                root.horizontal = insertHorizontal(root.horizontal, k1, k2, k3);
	            } else if (k1 < root.k1) {
	                root.left = insertRecVal(root.left, k1, k2, k3);
	            } else {
	                root.right = insertRecVal(root.right, k1, k2, k3);
	            }
	            

	            return root;
	        }

	        private Node insertHorizontal(Node root, int k1, int k2, int k3) {
	            if (root == null) {
	                return new Node(k1, k2, k3);
	            }

	            if (k2 == root.k2 && k3 == root.k3) {
	                return root; 
	            }

	            root.horizontal = insertHorizontal(root.horizontal, k1, k2, k3);
	            return root;
	        }

	        public void traverse() {
	            System.out.println("Result After Tree Traversal :");
	            traverseRecVal(root);
	        }

	        private void traverseRecVal(Node root) {
	            if (root == null) return;

	            traverseRecVal(root.left);

	            Node current = root;
	            while (current != null) {
	                System.out.println(current);
	                current = current.horizontal;
	            }

	            traverseRecVal(root.right);
	        }
	    }

	    public static int[][] generateRandomPhNums(int count) {
	        int[][] phNums = new int[count][3];
	        for (int k = 0; k < count; k++) {
	            phNums[k][0] = 100 + (int) (Math.random() * 900);
	            phNums[k][1] = 100 + (int) (Math.random() * 900);
	            phNums[k][2] = 1000 + (int) (Math.random() * 9000);
	        }
	        return phNums;
	    }

	    public static void main(String[] args) {
	        int[][] recordSet1 = {
	            {3, 1, 2}, {1, 2, 2}, {2, 2, 2}, {5, 2, 2}, {4, 1, 2},
	            {5, 1, 1}, {5, 3, 2}, {5, 3, 1}, {5, 3, 3}, {5, 2, 3}
	        };

	        System.out.println("===== Test with First Set of 10 Records =====");
	        ThreeDTree treeOne = new ThreeDTree();
	        for (int[] record : recordSet1) {
	            treeOne.insertValue(record[0], record[1], record[2]);
	        }
	        treeOne.traverse();

	        int[][] recordSet2 = {
	            {5, 2, 2}, {5, 2, 3}, {5, 2, 4}, {5, 2, 5}, {5, 3, 1},
	            {5, 3, 2}, {5, 3, 99}, {7, 4, 3}, {5, 3, 87}, {6, 4, 3},
	            {1, 7, 4}, {5, 4, 3}, {5, 4, 1}
	        };

	        System.out.println("\n===== Test with Second Set of 13 Records =====");
	        ThreeDTree treeTwo = new ThreeDTree();
	        for (int[] record : recordSet2) {
	            treeTwo.insertValue(record[0], record[1], record[2]);
	        }
	        treeTwo.traverse();

	        System.out.println("\n===== Test with 10 Random Phone Numbers =====");
	        int[][] randomPhonesTen = generateRandomPhNums(10);
	        ThreeDTree randomTreeTen = new ThreeDTree();
	        for (int[] phone : randomPhonesTen) {
	        	 System.out.println("Inserting: (" + phone[0] + "-" + phone[1] + "-" + phone[2] + ")");
	            randomTreeTen.insertValue(phone[0], phone[1], phone[2]);
	        }
	        randomTreeTen.traverse();

	        System.out.println("\n===== Test with 100 Random Phone Numbers =====");
	        int[][] randomPhones100 = generateRandomPhNums(100);
	        ThreeDTree randomTree100 = new ThreeDTree();
	        for (int[] ph : randomPhones100) {
	        	 System.out.println("Inserting: (" + ph[0] + "-" + ph[1] + "-" + ph[2] + ")");
	            randomTree100.insertValue(ph[0], ph[1], ph[2]);
	        }
	        randomTree100.traverse();
	        System.out.println("Successfully inserted and traversed 100 random phone numbers");

	        System.out.println("\n===== Test with 500 Random Phone Numbers =====");
	        int[][] randomPhones500 = generateRandomPhNums(500);
	        ThreeDTree randomTree500 = new ThreeDTree();
	        for (int[] phone : randomPhones500) {
	        	System.out.println("Inserting: (" + phone[0] + "-" + phone[1] + "-" + phone[2] + ")");
	            randomTree500.insertValue(phone[0], phone[1], phone[2]);
	        }
	        randomTree500.traverse();
	        System.out.println("Successfully inserted and traversed 500 random phone numbers");
	    }

}
