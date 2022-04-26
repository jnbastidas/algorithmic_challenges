/**
 Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices,
 inclusive. Once all operations have been performed, return the maximum value in the array.

 Example:

 Operations:

     from   to  value_to_add
     1      5   3
     4      8   7
     6      9   1

    index->	  1 2 3  4  5 6 7 8 9 10
             [0,0,0, 0, 0,0,0,0,0, 0]
             [3,3,3, 3, 3,0,0,0,0, 0]
             [3,3,3,10,10,7,7,7,0, 0]
             [3,3,3,10,10,8,8,8,1, 0]

 The largest value is 10 after all operations are performed.
 */

package impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxValueAfterApplyOperationsToArray {
    public long solution(final int n, final List<List<Integer>> queries) {
        final Map<Integer, Integer> map = new HashMap<>();

        queries.forEach(q -> {
            final int from = q.get(0);
            final int to = q.get(1);
            final int value = q.get(2);

            map.put(from, (map.getOrDefault(from, 0)) + value);
            map.put(to + 1, (map.getOrDefault(to + 1, 0)) - value);
        });

        long max = 0;
        long value = 0;

        for (int i = 1; i <= n; i++) {
            value += map.getOrDefault(i, 0);
            max = Math.max(max, value);
        }

        return max;
    }
}
