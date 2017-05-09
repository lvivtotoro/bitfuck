package org.midnightas.bitfuck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

// Eclipse's formatting feature fǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅked up
public class bitfuck {
	
	public static final List<HashMap<TripleBooleanCell, Consumer<bitfuck>>> meals = new ArrayList<>();
	
	static {
		{
			HashMap<TripleBooleanCell, Consumer<bitfuck>> lvl1Meals = new HashMap<>();
			lvl1Meals.put(new TripleBooleanCell(false, false, true), fuck -> {
				fuck.accel++;
			});
			lvl1Meals.put(new TripleBooleanCell(false, true, false), fuck -> {
				fuck.accel--;
			});
			lvl1Meals.put(new TripleBooleanCell(false, true, true), fuck -> {
				fuck.stack.push(fuck.accel);
				fuck.accel = 0;
			});
			lvl1Meals.put(new TripleBooleanCell(true, false, false), fuck -> {
				System.out.print(fuck.stack.pop());
			});
			lvl1Meals.put(new TripleBooleanCell(true, false, true), fuck -> {
				System.out.print(fuck.stack.peek());
			});
			lvl1Meals.put(new TripleBooleanCell(true, true, false), fuck -> {
				fuck.stack.push(fuck.stack.peek());
			});
			meals.add(0, lvl1Meals);
		}
	}
	
	public Stack stack = new Stack();
	
	public BitArray ba;
	public int index = -1;
	
	public int accel = 0;
	
	// has you'r mind been fuckified fully
	public boolean fucked = false;
	
	public bitfuck(BitArray ba) {
		this.ba = ba;
	}
	
	public void w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ() {
		for(int i = 0; i < ba.size(); i++) {
			System.out.print(ba.getBit(i) + " ");
		}
		System.out.println();
		
		while(!fucked) {
			boolean one = next(), two = next(), three = next();
			TripleBooleanCell cell = new TripleBooleanCell(one, two, three);
			if(meals.get(0).containsKey(cell))
				meals.get(0).get(cell).accept(this);
		}
		System.out.println("\n" + accel + " " + stack);
	}
	
	public boolean next() {
		proceed();
		if(fucked)
			return false;
		return ba.getBit(index);
	}
	
	public void proceed() {
		index++;
		if(index >= ba.size()) {
			fucked = true;
		}
	}
	
	public void input() {
		
	}
	
	public static void w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ(
			byte[] b) {
		w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ(
				new BitArray(b));
	}
	
	public static void w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ(
			BitArray ba) {
		new bitfuck(ba)
				.w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ();
	}
	
	public static final void main(String[] args) {
		w̝̗̟̩̬̠͈̲͈͎̱̱̄̿ͮ̔ȁ̙͉̩͈͈̝̹̙̘͈̪͍̻͕̝̫̊̊͒́̏ͭ̓ͨ̔̋ͥͬ̿̚n̦̰͙͔̦͔̳̳͍̠̹͉̮̙ͯ̑̐̾͐ͅn̙͕̲ͪͭ͂ͨ͆̓̐̂ͦ͛̇ͅa͇͙̲͖̫̲̝̻̺̜̤͎͓̓̓̈ͦ̿̅͗F̬͓̘͕͐̾ͩ͌͒ͪ̓͐͑͋̓̆̾͊̚ǔ͇̳͍̖̥̰̲̦̖͍͇̯ͯ͒̌͊ͬ̊̅̀̾ͭ̌ͤ̿ͨ̐c̞̱̠͓̤̥̲̺̟̫͚ͬ͋̊̅̚ͅk̤̩̳̤̟̫̯̬͓̪̜̼̉ͧ͂ͅ(
				new byte[] { 0b00100101, (byte) 0b11011010 });
	}
	
}
