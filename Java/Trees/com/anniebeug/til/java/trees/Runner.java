package com.anniebeug.til.java.trees;

public class Runner {
	public static void main(String args[]) {
		System.out.println("Hello");
		
		BinaryTree<Integer> myTree = new BinaryTree<Integer>(4);
		myTree.insert(5);
	}
}
