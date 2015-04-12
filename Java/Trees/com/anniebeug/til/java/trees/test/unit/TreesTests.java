package com.anniebeug.til.java.trees.test.unit;

import org.junit.Test;
import com.anniebeug.til.java.trees.*;
import com.anniebeug.til.java.trees.contracts.*;

public class TreesTests {

	@Test
	public void standardInts() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {12, 5, 2, 36, 0, 0, -12 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}
	
	@Test
	public void sortedInts() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {0, 1, 2, 4, 8, 29 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}
	
	@Test 
	public void sortedIntsDescending() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {100, 90, 80, 70, 50,20, 1 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}

}
