package impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class SmallestPositiveIntDoesNotOccurInArray {
	public int solution(final int[] A) {
		int n = A.length;

		boolean[] present = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;
		}

		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				return i;
			}
		}

		return n + 1;
	}
}
