package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RearrangeArrayAtEvenOrOddPositionTest {

	private RearrangeArrayAtEvenOrOddPosition rearrangeArrayAtEvenOrOddPosition;

	@BeforeEach
	public void initialSetUp() {
		this.rearrangeArrayAtEvenOrOddPosition = new RearrangeArrayAtEvenOrOddPosition();
	}

	@Test
	public void test1() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7};
		final int[] expected = {4, 5, 3, 6, 2, 7, 1};

		Assertions.assertArrayEquals(expected, this.rearrangeArrayAtEvenOrOddPosition.rearrangeArr(input));
	}

	@Test
	public void test2() {
		final int[] input = {1, 2, 1, 4, 5, 6, 8, 8};
		final int[] expected = {4, 5, 2, 6, 1, 8, 1, 8};

		Assertions.assertArrayEquals(expected, this.rearrangeArrayAtEvenOrOddPosition.rearrangeArr(input));
	}


	@Test
	public void test3() {
		final int[] input = {1, 1, 1, 2, 2, 2, 1};
		final int[] expected = {1, 2, 1, 2, 1, 2, 1};

		Assertions.assertArrayEquals(expected, this.rearrangeArrayAtEvenOrOddPosition.rearrangeArr(input));
	}
}
