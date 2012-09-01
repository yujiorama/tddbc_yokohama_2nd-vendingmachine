package demo;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	private int amount = 0;
	private List<Integer> insertedCoins = new ArrayList<Integer>();

	public int totalAmount() {
		return this.amount;
	}

	public void receive(int i) {
		this.amount += i;
		this.insertedCoins.add(i);
	}

	public List<Integer> refund() {
		return insertedCoins;
	}

}
