package com.anniebeug.til.java.trees;
import com.anniebeug.til.java.trees.contracts.Tree;
import com.anniebeug.til.java.trees.contracts.TreeNode;

/**
 * An implementation of a tree as a binary tree.
 * Duplicates are excluded.
 * 
 * @author asbeug
 *
 * @param <T>
 */
public class BinaryTree<T extends Comparable<T>> implements Tree<T> {
	private BinaryTreeNode<T> root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public BinaryTree(T value)
	{
		this.root = new BinaryTreeNode<T>(null, value);
	}

	public BinaryTreeNode<T> getRoot() {
		return this.root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}

	@Override
	public void insert(T value) {
		if (root == null) {
			this.root = new BinaryTreeNode<T>(null, value);
		} else {
			this.insertNode(this.root, value);
		}
	}

	@Override
	public void delete(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TreeNode<T> find(T value) {
		return null;
	}
	
	/**
	 * Insert value recursively.
	 * @param node
	 * @param value
	 */
	private void insertNode(TreeNode<T> node, T value) {
		if (node == null) {
			throw new IllegalArgumentException("Unable to add new node to empty node.");
		} 
		// Less than to the left
		else if (value.compareTo(node.getValue()) < 0) {
			if (node.getLeftChild() != null) {
				this.insertNode(node.getLeftChild(), value);
			} else {
				node.setLeftChild(new BinaryTreeNode<T>(node, value));
				return;
			}
		// Greater than to the right
		} else if (value.compareTo(node.getValue()) > 0) {
			if (node.getRightChild() != null) {
				this.insertNode(node.getRightChild(), value);
			} else {
				node.setRightChild(new BinaryTreeNode<T>(node, value));
				return;
			}
		// This value is a duplicate
		} else {
			return;
		}
	}
}
