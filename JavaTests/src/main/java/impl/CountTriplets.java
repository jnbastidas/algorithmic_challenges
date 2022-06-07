package impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class CountTriplets {
    public long solution(final List<Long> arr, final long r) {
        Collections.sort(arr);

        final Map<Long, Long> arrGroupedCount = arr.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        final AtomicLong rdo = new AtomicLong(0L);
        arrGroupedCount.forEach((val, count0) -> {
            final Long next1 = val * r;
            final Long next2 = next1 * r;

            if (arrGroupedCount.containsKey(next1) && arrGroupedCount.containsKey(next2)) {
                rdo.addAndGet(count0 * arrGroupedCount.get(next1)*arrGroupedCount.get(next2));
            }
        });

        System.out.println(arrGroupedCount);

        return rdo.get();
    }
}
