package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringIsRotationOfOtherTest {
	private StringIsRotationOfOther stringIsRotationOfOther;

	@BeforeEach
	public void initialSetUp() {
		this.stringIsRotationOfOther = new StringIsRotationOfOther();
	}

	@Test
	public void test1() {
		Assertions.assertTrue(this.stringIsRotationOfOther.string2IsRotationOfString1("abcdef", "defabc"));
	}

	@Test
	public void test2() {
		Assertions.assertTrue(this.stringIsRotationOfOther.string2IsRotationOfString1("abcdef", "abcdef"));
	}

	@Test
	public void test3() {
		Assertions.assertFalse(this.stringIsRotationOfOther.string2IsRotationOfString1("abcdef", "dfeabc"));
	}

	@Test
	public void test4() {
		Assertions.assertTrue(this.stringIsRotationOfOther.string2IsRotationOfString1(null, ""));
	}

	@Test
	public void test5() {
		Assertions.assertFalse(this.stringIsRotationOfOther.string2IsRotationOfString1(null, "abc"));
	}

	@Test
	public void test6() {
		Assertions.assertTrue(this.stringIsRotationOfOther.string2IsRotationOfString1("", null));
	}

	@Test
	public void test7() {
		Assertions.assertTrue(this.stringIsRotationOfOther.string2IsRotationOfString1("abc", null));
	}
}