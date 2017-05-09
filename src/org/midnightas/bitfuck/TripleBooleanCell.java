package org.midnightas.bitfuck;

import java.util.Arrays;

public class TripleBooleanCell {
	
	private final boolean[] bools;
	
	public TripleBooleanCell(boolean[] bools) {
		this.bools = bools;
	}
	
	public TripleBooleanCell(boolean one, boolean two, boolean three) {
		this(new boolean[] { one, two, three });
	}
	
	public boolean[] get() {
		return new boolean[] { bools[0], bools[1], bools[2] };
	}
	
	public boolean one() {
		return bools[0];
	}
	
	public boolean two() {
		return bools[1];
	}
	
	public boolean three() {
		return bools[2];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bools);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof TripleBooleanCell))
			return false;
		TripleBooleanCell other = (TripleBooleanCell) obj;
		if(!Arrays.equals(bools, other.bools))
			return false;
		return true;
	}
	
}
