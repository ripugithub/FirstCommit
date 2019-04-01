package com.practice.datastructure;

public class Stack {
	
	int[] arr;
	int stackSize;
	int top;
	
	
	public Stack()
	{
		this.stackSize = 5;
		top=-1;
		arr = new int[stackSize];
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	public void push(int data)
	{
		if(top<=stackSize)
		{
			resize();
		}
		
		arr[++top] = data;
	}
	
	public Integer pop()
	{
		int data;
		if(isEmpty())
		{
			System.out.println("NO elements in stack");
			return null;
		}
		else
		{
			data = arr[top--];
		}
		return data;
	}

	private void resize() {
		int[] temp = arr;
		stackSize = stackSize*2;
		arr = new int[stackSize];
		
		for(int i=0; i<temp.length; i++)
		{
			arr[i] = temp[i];
		}
	}
	
	

}
