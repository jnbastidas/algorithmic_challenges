package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LongestSubstringWithoutRepeatingCharactersTest {
	private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

	@BeforeEach
	public void initialSetUp() {
		this.longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
	}

	@Test
	public void test1() {
		Assertions.assertEquals("dabc", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("abcabcdabc"));
	}

	@Test
	public void test2() {
		Assertions.assertEquals("abcdef", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("abcdef"));
	}

	@Test
	public void test3() {
		Assertions.assertEquals("", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters(""));
	}

	@Test
	public void test4() {
		Assertions.assertNull(this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters(null));
	}

	@Test
	public void test5() {
		Assertions.assertEquals("b", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("bbbbbbb"));
	}
}
