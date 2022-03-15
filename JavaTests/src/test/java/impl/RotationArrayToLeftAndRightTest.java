package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RotationArrayToLeftAndRightTest {

	private RotationArrayToLeftAndRight rotationArrayToLeftAndRight;

	@BeforeEach
	public void initialSetUp() {
		this.rotationArrayToLeftAndRight = new RotationArrayToLeftAndRight();
	}

	@Test
	public void test1() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = this.rotationArrayToLeftAndRight.rotateLeft(input, 3);

		Assertions.assertArrayEquals(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3}, output);
	}

	//@Test
	public void test2() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = this.rotationArrayToLeftAndRight.rotateLeft(input, 11);

		Assertions.assertArrayEquals(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, output);
	}

	//@Test
	public void test3() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = this.rotationArrayToLeftAndRight.rotateLeft(input, 12);

		Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, output);
	}
}
