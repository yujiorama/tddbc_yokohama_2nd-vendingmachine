package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vm;

	@Test
	public void お金を投入していない時の合計金額は0円() {
		vm = new VendingMachine();
		assertEquals(0, vm.totalAmount());
	}

	@Test
	public void 十円を投入したら合計金額が10円になる() throws Exception {
		vm = new VendingMachine();
		vm.receive(10);
		assertEquals(10, vm.totalAmount());
	}

}
