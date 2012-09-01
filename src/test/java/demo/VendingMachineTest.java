package demo;

import static org.junit.Assert.*;

import java.util.Arrays;

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

	// 順番は考慮しない
	@Test
	public void 百円を投入し十円を投入したら110円になる() throws Exception {
		vm.receive(100);
		vm.receive(10);
		assertEquals(110, vm.totalAmount());
	}

	@Test
	public void 何も投入せずに払い戻したら釣り銭として空リストを返す() throws Exception {
		assertEquals(Arrays.asList(), vm.refund());
	}

	@Test
	public void 百円を投入して払い戻したら釣り銭に百円を返す() throws Exception {
		vm.receive(100);
		assertEquals(Arrays.asList(100), vm.refund());
	}

	@Test
	public void 五十円と五百円を投入して払い戻しをしたら釣り銭に五百円と五十円を返す() throws Exception {

	}
}
