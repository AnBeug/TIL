package com.anniebeug.til.java.trees.test.unit;

import org.junit.Assert;
import org.junit.Test;

import com.anniebeug.til.java.trees.*;
import com.anniebeug.til.java.trees.contracts.*;

public class TreesTests {

	@Test
	public void insertStandardInts() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {12, 5, 2, 36, 0, 0, -12 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}
	
	@Test
	public void insertSortedInts() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {0, 1, 2, 4, 8, 29 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}
	
	@Test 
	public void insertSortedIntsDescending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {100, 90, 80, 70, 50,20, 1 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}
	
	@Test
	public void findMinSortedDescending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {100, 90, 80, 70, 50,20, 1 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}
	
	@Test
	public void findMinSortedAscending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = { 1, 2, 4, 7, 8 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}

	@Test
	public void findMinUnsorted() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = { 12, 1, 52, 3, 793, 8, 24, 19 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}
	
	@Test
	public void findMaxSortedDescending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {100, 90, 80, 70, 50,20, 1 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}
	
	@Test
	public void findMaxSortedAscending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = { 1, 2, 4, 7, 8 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}
	
	@Test
	public void findMaxUnsorted() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = { 12, 1, 52, 3, 793, 8, 24, 19 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
		
		Integer actual = myTree.findMin();
		Assert.assertEquals(new Integer(1), actual);
	}
	
}
