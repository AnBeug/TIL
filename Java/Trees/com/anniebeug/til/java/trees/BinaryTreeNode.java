package com.anniebeug.til.java.trees;

import com.anniebeug.til.java.trees.contracts.TreeNode;


public class BinaryTreeNode<T> implements TreeNode<T> {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRightChild(TreeNode<T> rightChild) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLeftChild(TreeNode<T> leftChild) {
		// TODO Auto-generated method stub
		this.leftChild = leftChild;
	}
	
}
