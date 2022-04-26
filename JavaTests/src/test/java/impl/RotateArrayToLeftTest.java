package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class RotateArrayToLeftTest {
	private RotateArrayToLeft rotateArrayToLeft;

	@BeforeEach
	public void initialSetUp() {
		this.rotateArrayToLeft = new RotateArrayToLeft();
	}

	@Test
	public void test0() {
		Assertions.assertEquals(List.of(3, 4, 5, 1, 2), this.rotateArrayToLeft.solution(List.of(1, 2, 3, 4, 5), 2));
	}
}