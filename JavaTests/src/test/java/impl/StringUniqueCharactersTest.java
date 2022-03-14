package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringUniqueCharactersTest {
	private StringUniqueCharacters stringUniqueCharacters;

	@BeforeEach
	public void initialSetUp() {
		this.stringUniqueCharacters = new StringUniqueCharacters();
	}

	@Test
	public void test1() {
		Assertions.assertTrue(this.stringUniqueCharacters.hasUniqueCharacters("abcde"));
	}

	@Test
	public void test2() {
		Assertions.assertTrue(this.stringUniqueCharacters.hasUniqueCharacters(null));
	}

	@Test
	public void test3() {
		Assertions.assertTrue(this.stringUniqueCharacters.hasUniqueCharacters(""));
	}

	@Test
	public void test4() {
		Assertions.assertFalse(this.stringUniqueCharacters.hasUniqueCharacters("abcdee"));
	}
}
