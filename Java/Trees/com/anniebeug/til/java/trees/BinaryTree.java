package com.anniebeug.til.java.trees;

public class BinaryTree<T> {
	private BinaryTreeNode<T> root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public BinaryTree(T value)
	{
		this.root = new BinaryTreeNode<T>(value);
	}

	public BinaryTreeNode<T> getRoot() {
		return this.root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}
}
