package com.anniebeug.til.java.trees.test.unit;

import static org.junit.Assert.*;

import org.junit.Test;
import com.anniebeug.til.java.trees.*;
import com.anniebeug.til.java.trees.contracts.*;

public class TreesTests {

	@Test
	public void test() {
		Tree<Integer> myTree = new BinaryTree<Integer>();
		
		int[] insertSequence = {12, 5, 2, 36, 0, 0, -12 };
		
		for (int currentInt : insertSequence) {
			myTree.insert(currentInt);
		}
	}

}
