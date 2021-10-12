package com.bridgelab;

public class BinarySearchTree {
	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree");
		BinaryTree<Integer> myTree = new BinaryTree<>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		myTree.print(myTree.root);
	}
}
