package com.anniebeug.til.java.trees;


public class BinaryTreeNode<T> {
	private T value;
	private BinaryTreeNode<T> parent;
	private BinaryTreeNode<T> leftChild;
	private BinaryTreeNode<T> rightChild;
		
	public BinaryTreeNode(T value)
	{
		this.value = value;
		this.setParent(null);
		this.setLeftChild(null);
		this.setRightChild(null);
	}
	
	public BinaryTreeNode(BinaryTreeNode<T> parent, T value)
	{
		this.setParent(parent);
		this.setLeftChild(null);
		this.setRightChild(null);
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public BinaryTreeNode<T> getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode<T> parent) {
		this.parent = parent;
	}

	public BinaryTreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public BinaryTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	
}
