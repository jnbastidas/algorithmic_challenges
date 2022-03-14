package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AnagramStringTest {
	private AnagramString anagramString;

	@BeforeEach
	public void initialSetUp() {
		this.anagramString = new AnagramString();
	}

	@Test
	public void test0() {
		final String input1 = "Monkeys Write";
		final String input2 = "New York Times";

		Assertions.assertTrue(this.anagramString.areAnagramString(input1, input2));
	}

	@Test
	public void test1() {
		final String input1 = "New York Times";
		final String input2 = "Monkeys Write";

		Assertions.assertTrue(this.anagramString.areAnagramString(input1, input2));
	}

	@Test
	public void test2() {
		Assertions.assertTrue(this.anagramString.areAnagramString(null, null));
	}

	@Test
	public void test3() {
		Assertions.assertFalse(this.anagramString.areAnagramString(null, "hello"));
	}

	@Test
	public void test4() {
		Assertions.assertFalse(this.anagramString.areAnagramString("Hello", null));
	}

	@Test
	public void test5() {
		Assertions.assertFalse(this.anagramString.areAnagramString("", "hello"));
	}

	@Test
	public void test6() {
		Assertions.assertFalse(this.anagramString.areAnagramString("Hello", ""));
	}

	@Test
	public void test7() {
		Assertions.assertTrue(this.anagramString.areAnagramString(null, ""));
	}

	@Test
	public void test8() {
		final String input1 = "Monkeys Writte";
		final String input2 = "New York Times";

		Assertions.assertFalse(this.anagramString.areAnagramString(input1, input2));
	}
}