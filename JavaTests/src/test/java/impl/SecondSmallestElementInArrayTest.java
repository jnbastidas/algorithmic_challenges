package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SecondSmallestElementInArrayTest {
	private SecondSmallestElementInArray secondSmallestElementInArray;

	@BeforeEach
	public void initialSetUP() {
		this.secondSmallestElementInArray = new SecondSmallestElementInArray();
	}

	@Test
	public void test1() {
		final int[] input = {5, 2, 3, 4};
		final int output = 3;

		Assertions.assertEquals(output, this.secondSmallestElementInArray.getSecondSmallestElementInArray(input));
	}

	@Test
	public void test2() {
		final int[] input = {34, 14, 12, 50, 14, 50};
		final int output = 14;

		Assertions.assertEquals(output, this.secondSmallestElementInArray.getSecondSmallestElementInArray(input));
	}

	@Test
	public void test3() {
		final int[] input = {34};
		final int output = 0;

		Assertions.assertEquals(output, this.secondSmallestElementInArray.getSecondSmallestElementInArray(input));
	}

	@Test
	public void test4() {
		final int[] input = {34, 14, 12, 50, 14};
		final int output = 14;

		Assertions.assertEquals(output, this.secondSmallestElementInArray.getSecondSmallestElementInArray(input));
	}
}
