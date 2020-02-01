package org.learnbay.stacks;

import java.util.Iterator;
import java.util.Stack;

public class MinStacks {
	Stack<Integer> origStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	void getMin() {
		System.out.println( "Min number " + minStack.peek() );
	}
	
	void print() {
		Iterator<Integer> val = origStack.iterator();
		while( val.hasNext() ) {
			System.out.print( val.next() + " " );
		}
		
		System.out.println();
		
		val = minStack.iterator();
		while( val.hasNext() ) {
			System.out.print( val.next() + " " );
		}

		System.out.println();

	}
	public static void main(String[] args) {
		MinStacks ms = new MinStacks();
		
		int minNum = 99999;
		for( int i = 0; i < 10; i++ ) {
			int tmp = (int) (Math.random() * 100);
			ms.origStack.push( tmp );
			if( tmp < minNum ) {
				ms.minStack.push( tmp );
				minNum = tmp;
			}
		}
		ms.print();
		
		ms.getMin();
	}
}
	