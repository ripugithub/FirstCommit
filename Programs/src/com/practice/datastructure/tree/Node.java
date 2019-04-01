package com.practice.datastructure.tree;

public class Node {
	
	public Node leftChild;
	public Node rightChild;
	public int data;
	
	
	public Node()
	{
		leftChild = rightChild = null;
	}
	
	public Node(int data)
	{
		leftChild = rightChild = null;
		this.data = data;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	

}
