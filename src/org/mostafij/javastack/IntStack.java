package org.mostafij.javastack;

public class IntStack {
	private int[] stackArray;
	private int topOfStack;
	
	public IntStack(int capacity) {
		stackArray = new int[capacity];
		topOfStack = -1;
	}
	
	public void push(int element){
		stackArray[++topOfStack] = element;
	}
	
	public int pop(){
		return stackArray[topOfStack--];
	}
	
	public int peek(){
		return stackArray[topOfStack];
	}
	
	public boolean isEmpty(){
		return topOfStack<0;
	}
	
	public boolean isFull(){
		return topOfStack == stackArray.length-1;
	}

}
