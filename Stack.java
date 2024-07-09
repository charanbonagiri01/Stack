package com.bwinparty.compliance.monitor.cron;

public class Stack {

	private Node top;
	
	public Stack()
	{
		this.top = null;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	public int pop()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("POP is empty please insert and try again");
		}
		int popnode = top.data;
		top= top.next;
		return popnode;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("Peek from empty stack");
		}
		return top.data;
	}
}
