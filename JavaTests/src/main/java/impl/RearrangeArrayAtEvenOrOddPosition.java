package impl;

import java.util.Arrays;


public class RearrangeArrayAtEvenOrOddPosition {
	public int[] rearrangeArr(final int[] input) {
		Arrays.sort(input);
		final int[] rdo = new int[input.length];

		int currentPosRdo = input.length - 1;
		int jumpPositions = -2;
		if (input.length%2 == 0) { // inpur array is even?
			for (int i = input.length - 1; i >= 0; i--) {
				rdo[currentPosRdo] = input[i];
				currentPosRdo = currentPosRdo + jumpPositions;

				if (currentPosRdo < 1) {
					currentPosRdo = 0;
					jumpPositions = 2;
				}
			}
		} else {
			for (int i = 0; i < input.length; i++) {
				rdo[currentPosRdo] = input[i];
				currentPosRdo = currentPosRdo + jumpPositions;

				if (currentPosRdo < 0) {
					currentPosRdo = 1;
					jumpPositions = 2;
				}
			}
		}

		return rdo;
	}
}
