package epam;

public class SecondSmallestElementInArray {
	public int getSecondSmallestElementInArray(final int[] input) {
		//Arrays.sort(input); // O(n log(n))

		if (input.length <= 1) {
			return 0;
		}

		//O(n)
		int smallestVal = input[0];
		int secondSmallestVal = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < smallestVal) {
				secondSmallestVal = smallestVal;
				smallestVal = input[i];
			} else if (input[i] < secondSmallestVal) {
				secondSmallestVal = input[i];
			}
		}

		return secondSmallestVal;
	}
}
