package com.anniebeug.til.java.trees.contracts;

public interface Tree<T extends Comparable<T>> {
	public void insert(T value);
	public void delete(T value);
	public T findMin();
	public T findMax();
	public TreeNode<T> find(T value);
}
