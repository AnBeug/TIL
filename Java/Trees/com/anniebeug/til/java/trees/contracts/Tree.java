package com.anniebeug.til.java.trees.contracts;

public interface Tree<T> {
	public void insert(T value);
	public void delete(T value);
	public TreeNode<T> find(T value);
}
