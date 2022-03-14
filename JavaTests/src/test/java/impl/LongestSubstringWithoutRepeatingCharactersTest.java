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
		Assertions.assertEquals("abcd", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("abcabcdabc"));
	}

	@Test
	public void test2() {
		Assertions.assertEquals("abcdef", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("abcdefaabcdef"));
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

	@Test
	public void test6() {
		Assertions.assertEquals("be coding", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("always be coding"));
	}

	@Test
	public void test7() {
		Assertions.assertEquals("NGISAWE", this.longestSubstringWithoutRepeatingCharacters.getTheLongestSubstringWithoutRepeatingCharacters("CODINGISAWESOME"));
	}
}