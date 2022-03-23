package impl;

import java.util.Arrays;

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

		if (A == null && A.length == 0) {
			return 1;
		}

		Arrays.sort(A);
		int rdo = 0;
		//1, x, 3, 4
		for (int i = 0; i < A.length; i++) {
			rdo++;
			if (A[i] < rdo) {
				rdo = A[i];
			}
		}

		return rdo <= 0 ? 1 : rdo;
	}
}
