package com.anniebeug.til.java.trees;

import com.anniebeug.til.java.trees.contracts.Tree;

public class Runner {
	public static void main(String args[]) {
		System.out.println("Hello");
		
		Tree<Integer> myTree = new BinaryTree<Integer>(4);
		myTree.insert(5);
	}
}
