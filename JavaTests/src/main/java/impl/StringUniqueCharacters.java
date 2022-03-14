package impl;

import java.util.HashSet;
import java.util.Set;


public class StringUniqueCharacters {
	public boolean hasUniqueCharacters(final String input) {
		if (input == null) {
			return true;
		}

		boolean rdo = true;
		final Set<Character> characterSet = new HashSet<>();
		for (final Character character : input.toCharArray()) {
			if (!characterSet.add(character)) {
				rdo = false;
				break;
			}
		}

		return rdo;
	}
}
