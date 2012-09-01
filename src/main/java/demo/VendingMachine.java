package demo;

public class VendingMachine {

	private int amount = 0;

	public int totalAmount() {
		return this.amount;
	}

	public void receive(int i) {
		this.amount = i;
	}

}
