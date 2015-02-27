package org.mostafij.test;

import org.mostafij.javastack.CharStack;

public class Test {

	public static void main(String[] args) {
		CharStack charStack = new CharStack(10);
		char[] array = {'a','b','c','d','e','f','g','h','i','j','k'};
		for(int i=0;i<array.length;i++){
			if(charStack.isFull()){
				System.out.println("Stck is full");
			}else{
				charStack.push(array[i]);
			}
		}
		
		System.out.println("Stack Print out");
		
		for(int i=0;i<array.length;i++){
			if(charStack.isEmpty()){
				System.out.println("Stack is Empty");
			}else{
				System.out.print(charStack.pop()+"\t");
			}
		}

	}

}
