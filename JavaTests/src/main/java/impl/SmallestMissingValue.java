/**
 Find the smallest missing number in a sorted array
     Input: [0, 1, 2, 6, 9]
     Output: 3
     Input: [4, 5, 10, 11]
     Output: 0
     Input: [0, 1, 2, 3]
     Output: 4
     Input: [0, 1, 2, 3, 4, 5, 6, 7, 10]
     Output: 8
 **/

package impl;

public class SmallestMissingValue {

    public int solution(final int[] arr) {
        final int biggestValue = arr[arr.length - 1];

        for (int i = 0; i <= biggestValue; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return biggestValue + 1;
    }
}
