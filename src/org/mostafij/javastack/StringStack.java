package org.mostafij.javastack;

public class StringStack {
	private String[] stackArray;
	private int topOfStack;
	
	public StringStack(int capacity) {
		stackArray = new String[capacity];
		topOfStack = -1;
	}
	
	public void push(String element){
		stackArray[++topOfStack] = element;
	}
	
	public String pop(){
		return stackArray[topOfStack--];
	}
	
	public String peek(){
		return stackArray[topOfStack];
	}
	
	public boolean isEmpty(){
		return topOfStack<0;
	}
	
	public boolean isFull(){
		return topOfStack == stackArray.length-1;
	}

}
