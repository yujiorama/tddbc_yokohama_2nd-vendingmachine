package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vm;

	// B でテンプレート
	@Before
	public void before() throws Exception {
		vm = new VendingMachine();
	}

	@Test
	public void お金を投入していない時の合計金額は0円() {
		assertEquals(0, vm.totalAmount());
	}

	@Test
	public void 十円を投入したら合計金額が10円になる() throws Exception {
		vm.receive(10);
		assertEquals(10, vm.totalAmount());
	}

}
