package demo;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	private List<Integer> insertedCoins = new ArrayList<Integer>();

	public int totalAmount() {
		int amount = 0;
		for (int i : insertedCoins) {
			amount += i;
		}
		return amount;
	}

	public void receive(int i) {
		this.insertedCoins.add(i);
	}

	public List<Integer> refund() {
		return insertedCoins;
	}
	// amount と insertedCoins が同じ情報を持ってる
	// refound が insertedCoins を空にしない

}
