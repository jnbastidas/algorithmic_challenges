package impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ReverseStringTest {
	private ReverseString reverseString;

	@BeforeEach
	private void initialSetUp() {
		this.reverseString = new ReverseString();
	}

	@Test
	public void test1() {
		final String rdo = this.reverseString.getReverseString("54321");
		Assertions.assertEquals("12345", rdo);
	}

	@Test
	public void test2() {
		final String rdo = this.reverseString.getReverseString(null);
		Assertions.assertNull(rdo);
	}

	@Test
	public void test3() {
		final String rdo = this.reverseString.getReverseString("");
		Assertions.assertEquals("", rdo);
	}
}
