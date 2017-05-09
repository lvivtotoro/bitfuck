package org.midnightas.bitfuck;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<Integer> stack = new ArrayList<Integer>();
	
	public Stack() {
	}
	
	public Integer pop() {
		return pop(0);
	}
	
	public Integer pop(int index) {
		return stack.remove(index);
	}
	
	public void push(Integer integer) {
		push(0, integer);
	}
	
	public void push(int index, Integer integer) {
		stack.add(index, integer);
	}
	
	public Integer peek() {
		return peek(0);
	}
	
	public Integer peek(int index) {
		return stack.get(index);
	}
	
	public String toString() {
		return stack.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Stack other = (Stack) obj;
		if(stack == null) {
			if(other.stack != null)
				return false;
		} else if(!stack.equals(other.stack))
			return false;
		return true;
	}
	
}
