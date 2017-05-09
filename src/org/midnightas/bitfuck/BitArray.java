package org.midnightas.bitfuck;

// Courtesy of phatfingers
// because java.util.BitSet was shit
public class BitArray {
	
	private byte bitX8[] = null;
	
	public BitArray(int size) {
		bitX8 = new byte[size / 8 + (size % 8 == 0 ? 0 : 1)];
	}
	
	public BitArray(byte[] bytes) {
		bitX8 = new byte[bytes.length];
		for(int by = 0; by < bytes.length; by++) {
			for(int bi = 0; bi < 8; bi++) {
				setBit(by * Byte.SIZE + bi, (bytes[by] >> (7 - bi) & 1) == 1);
			}
		}
	}
	
	public BitArray(boolean... bools) {
		if(bools.length % 8 != 0)
			throw new IndexOutOfBoundsException("Array size not divisiable by 8");
		bitX8 = new byte[bools.length / 8];
		for(int i = 0; i < bools.length; i++)
			setBit(i, bools[i]);
	}
	
	public boolean getBit(int pos) {
		return (bitX8[pos / 8] & (1 << (pos % 8))) != 0;
	}
	
	public void setBit(int pos, boolean b) {
		byte b8 = bitX8[pos / 8];
		byte posBit = (byte) (1 << (pos % 8));
		if(b) {
			b8 |= posBit;
		} else {
			b8 &= (255 - posBit);
		}
		bitX8[pos / 8] = b8;
	}
	
	public int size() {
		return bitX8.length * Byte.SIZE;
	}
	
	public String toBoolString() {
		StringBuffer b = new StringBuffer();
		for(int i = 0; i < size(); i++) {
			b.append(" ");
			b.append(getBit(i));
		}
		return b.substring(1);
	}
	
}