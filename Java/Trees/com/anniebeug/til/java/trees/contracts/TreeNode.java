package com.anniebeug.til.java.trees.contracts;

public interface TreeNode<T> {
	public T getValue();
	public void setValue(T value);
	public TreeNode<T> getParent();
	public void setParent(TreeNode<T> parent);
	public TreeNode<T> getRightChild();
	public void setRightChild(TreeNode<T> rightChild);
	public TreeNode<T> getLeftChild();
	public void setLeftChild(TreeNode<T> leftChild);
}
