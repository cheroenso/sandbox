package com.cwb.struct;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Node {
		  private final int value;
		  private final List<Node> children;

		  public Node(int value) {
		    this.value = value;
		    this.children = new LinkedList<Node>();
		  }

		  public int getValue() {
		    return value;
		  }

		  public List<? extends Node> getChildren() {
		    return Collections.unmodifiableList(children);
		  }

		  public void addChild(Node child) { 
		    children.add(child);
		  }
}
//public class Tree {
//private Node root;
//
//public Tree(String rootData) {
//    root = new Node();
//    root.data = rootData;
//    root.children = new ArrayList<Node>();
//}
//
//private class Node {
//    private String data;
//    private Node parent;
//    private List<Node> children;
//}
//}
