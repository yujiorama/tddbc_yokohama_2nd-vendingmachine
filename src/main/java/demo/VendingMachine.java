package demo;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	private int amount = 0;

	public int totalAmount() {
		return this.amount;
	}

	public void receive(int i) {
		this.amount += i;
	}

	public List<Integer> refund() {
		return new ArrayList<Integer>();
	}

}
