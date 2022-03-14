package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FirstNonRepeatedCharacterTest {
	private FirstNonRepeatedCharacter firstNonRepeatedCharacter;

	@BeforeEach
	public void initialSetUp() {
		this.firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
	}

	@Test
	public void test1() {
		Assertions.assertEquals('t', this.firstNonRepeatedCharacter.getFirstNonRepeatedCharacter("abtcanbcm"));
	}

	@Test
	public void test2() {
		Assertions.assertNull(this.firstNonRepeatedCharacter.getFirstNonRepeatedCharacter("abcdabcd"));
	}

	@Test
	public void test3() {
		Assertions.assertNull(this.firstNonRepeatedCharacter.getFirstNonRepeatedCharacter(null));
	}

	@Test
	public void test4() {
		Assertions.assertNull(this.firstNonRepeatedCharacter.getFirstNonRepeatedCharacter(""));
	}
}
