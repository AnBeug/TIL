package com.anniebeug.til.java.trees;

import com.anniebeug.til.java.trees.contracts.TreeNode;

public class BinaryTreeNode<T> implements TreeNode<T> {
	private T value;
	private TreeNode<T> parent;
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;
		
	public BinaryTreeNode(TreeNode<T> parent, T value)
	{
		this.setParent(parent);
		this.setLeftChild(null);
		this.setRightChild(null);
		this.setValue(value);
	}
	
	@Override
	public T getValue() {
		return this.value;
	}
	
	@Override
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public TreeNode<T> getParent() {
		return parent;
	}

	@Override
	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	@Override
	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	@Override
	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	@Override
	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	
	public String toString()	{
		return "{ value: " + this.getValue() + " }";
	}
}
