package impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TransactionsPerCurrency {
	public Map<String, Long> getTransactionsPerCurrency(final List<Map<String, Long>> transactions) {
		//Traditional Implementation
		/*final Map<String, Long> rdo = new HashMap<>();
		for(final Map<String, Long> mapTxs: transactions) {
			for(final Map.Entry<String, Long> entry: mapTxs.entrySet()) {
				if (rdo.containsKey(entry.getKey())) {
					final Long total = rdo.get(entry.getKey());
					rdo.put(entry.getKey(), total + entry.getValue());
				} else {
					rdo.put(entry.getKey(), entry.getValue());
				}
			}
		}*/

		// Streams implementation
		final Map<String, Long> rdo = transactions.stream().flatMap(txMap -> txMap.entrySet().stream()).collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingLong(Map.Entry::getValue)));

		return rdo;
	}
}
