package com.anniebeug.til.java.trees;
import com.anniebeug.til.java.trees.contracts.Tree;
import com.anniebeug.til.java.trees.contracts.TreeNode;

public class BinaryTree<T> implements Tree<T> {
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

	@Override
	public void insert(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TreeNode<T> find(T value) {
		// TODO Auto-generated method stub
		return null;
	}
}
