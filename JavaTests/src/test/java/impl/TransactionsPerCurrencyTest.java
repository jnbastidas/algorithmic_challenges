package impl;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TransactionsPerCurrencyTest {
	private TransactionsPerCurrency transactionsPerCurrency;

	@BeforeEach
	public void initialSetUp() {
		this.transactionsPerCurrency = new TransactionsPerCurrency();
	}

	@Test
	public void test1() {
		final Map<String, Long> tx1 = Map.of("EUR", 100L, "USD", 200L);
		final Map<String, Long> tx2 = Map.of("USD", 200L, "COP", 400L);
		final Map<String, Long> tx3 = Map.of("USD", 300L, "COP", 500L);

		final Map<String, Long> rdo = this.transactionsPerCurrency.getTransactionsPerCurrency(List.of(tx1, tx2, tx3));

		Assertions.assertEquals(100L, rdo.get("EUR"));
		Assertions.assertEquals(200L + 200L + 300L, rdo.get("USD"));
		Assertions.assertEquals(400L + 500L, rdo.get("COP"));
	}
}
