package impl;

public class RotationArrayToLeftAndRight {
	public int[] rotateLeft(final int[] input, final int distanceToRotate) {
		final int sizeOfElements = input.length;
		final int finalDistanceToRotate = distanceToRotate%sizeOfElements;

		final int[] toMove = new int[finalDistanceToRotate];
		System.arraycopy(input, 0, toMove, 0, finalDistanceToRotate);

		if (sizeOfElements - 1 - finalDistanceToRotate + 1 >= 0)
			System.arraycopy(input, finalDistanceToRotate, input, 0, sizeOfElements - 1 - finalDistanceToRotate + 1);

		System.arraycopy(toMove, 0, input, sizeOfElements - finalDistanceToRotate, toMove.length - 1 + 1);

		return input;
	}
}