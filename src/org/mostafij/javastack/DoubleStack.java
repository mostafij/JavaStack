package org.mostafij.javastack;

public class DoubleStack {
	private double[] stackArray;
	private int topOfStack;
	
	public DoubleStack(int capacity) {
		stackArray = new double[capacity];
		topOfStack = -1;
	}
	
	public void push(double element){
		stackArray[++topOfStack] = element;
	}
	
	public double pop(){
		return stackArray[topOfStack--];
	}
	
	public double peek(){
		return stackArray[topOfStack];
	}
	
	public boolean isEmpty(){
		return topOfStack<0;
	}
	
	public boolean isFull(){
		return topOfStack == stackArray.length-1;
	}

}

