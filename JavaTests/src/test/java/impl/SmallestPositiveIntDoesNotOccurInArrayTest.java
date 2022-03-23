package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SmallestPositiveIntDoesNotOccurInArrayTest {
	private SmallestPositiveIntDoesNotOccurInArray smallestPositiveIntDoesNotOccurInArray;

	@BeforeEach
	public void initialSetUp() {
		this.smallestPositiveIntDoesNotOccurInArray = new SmallestPositiveIntDoesNotOccurInArray();
	}

	@Test
	public void test1() {
		Assertions.assertEquals(5, this.smallestPositiveIntDoesNotOccurInArray.solution(new int[]{1, 3, 6, 4, 1, 2}));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(4, this.smallestPositiveIntDoesNotOccurInArray.solution(new int[]{1, 2, 3}));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(1, this.smallestPositiveIntDoesNotOccurInArray.solution(new int[]{-1, -3}));
	}
}
