package com.cwb.struct;

public class BinaryTreeTest {
	  public static void main(String[] args) {
		    new BinaryTreeTest().run();
		  }
	  
	  public void run() {
		    // build the simple tree from chapter 11.
		  long start = System.currentTimeMillis();
		    BinaryNode root = new BinaryNode(5);
		    System.out.println("Binary Tree Example");
		    System.out.println("Building tree with root value " + root.value);
		    insert(root, 1);
		    insert(root, 8);
		    insert(root, 6);
		    insert(root, 3);
		    insert(root, 9);
		    for ( int i = 0; i < 1000; i++){
		    	insert(root, i);
		    }
		    System.out.println("elapsed insert: " + Long.toString(System.currentTimeMillis() - start));
		    System.out.println("Traversing tree in order");
		    printInOrder(root);
		    System.out.println("Traversing tree front-to-back from location 7");
		    printFrontToBack(root, 7);
		    System.out.println("elapsed traverse: " + Long.toString(System.currentTimeMillis() - start));
		    total(root);
		    System.out.println("elapsed total: " + Long.toString(System.currentTimeMillis() - start));
		    printPreOrder(root);
		  }
	  
		 public void insert(BinaryNode node, int value) {
			    if (value < node.value) {
			      if (node.left != null) {
			        insert(node.left, value);
			      } else {
			        System.out.println("  Inserted " + value + " to left of "
			            + node.value);
			        node.left = new BinaryNode(value);
			      }
			    } else if (value > node.value) {
			      if (node.right != null) {
			        insert(node.right, value);
			      } else {
			        System.out.println("  Inserted " + value + " to right of "
			            + node.value);
			        node.right = new BinaryNode(value);
			      }
			    }
		 }
		 
		  public void printInOrder(BinaryNode node) {
			    if (node != null) {
			      printInOrder(node.left);
			      System.out.println("  Traversed " + node.value);
			      printInOrder(node.right);
			    }
			  }

		  /**
		   * uses in-order traversal when the origin is less than the node's value
		   * 
		   * uses reverse-order traversal when the origin is greater than the node's
		   * order
		   */
		  public void printFrontToBack(BinaryNode node, int camera) {
		    if (node == null)
		      return;
		    if (node.value > camera) {
		      // print in order
		      printFrontToBack(node.left, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.right, camera);
		    } else if (node.value < camera) {
		      // print reverse order
		      printFrontToBack(node.right, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.left, camera);
		    } else {
		      // order doesn't matter
		      printFrontToBack(node.left, camera);
		      printFrontToBack(node.right, camera);
		    }
		  }
		  
		    public static int total (BinaryNode tree) { 
		        if (tree == null) return 0; 
//		        int cargo = (Integer) tree.value; 
		        int cargo = tree.value; 
//		        return cargo.intValue() + total (tree.left) + total (tree.right); 
		        return cargo + total (tree.left) + total (tree.right); 
		    } 
		    
		    public static void printPreOrder (BinaryNode tree) { 
		        if (tree == null) return; 
		        System.out.print (tree + " "); 
		        printPreOrder (tree.left); 
		        printPreOrder (tree.right); 
		    } 
}
