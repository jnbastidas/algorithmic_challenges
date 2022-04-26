/**
 You are given an unordered array consisting of consecutive integers E [1, 2, 3, ..., n] without any duplicates.
 You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.

 Example:

 arr = [7, 1, 3, 2, 4, 5, 6]

 i   arr                     swap (indices)
 0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
 1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
 2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
 3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
 4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
 5   [1, 2, 3, 4, 5, 6, 7]

 Rdo: 5
 */
package impl;

import java.util.Arrays;

public class MinimumSwapsToOrder {
    public int solution(final int[] arr) {
        int rdo = 0;
        final int minVal = Arrays.stream(arr).min().orElse(0);

        for (int arrPos = 0; arrPos < arr.length; arrPos++) {
            final int orderedPos = arrPos + minVal;

            if (arr[arrPos] > orderedPos) {
                 final int tempVal = arr[arr[arrPos] - minVal];
                arr[arr[arrPos] - minVal] = arr[arrPos];
                arr[arrPos] = tempVal;
                arrPos--;
                rdo++;
            }
        }

        return rdo;
    }
}