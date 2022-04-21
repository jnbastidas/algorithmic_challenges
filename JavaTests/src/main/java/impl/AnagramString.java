package impl;

import java.util.ArrayList;
import java.util.List;

public class AnagramString {
	public boolean areAnagramString(final String input1, final String input2) {
		final List<Character> input1List = new ArrayList<>(input1 == null ? new ArrayList<>() : input1.toLowerCase().chars().mapToObj(c -> (char) c).toList());
		final char[] input2Chars = input2 == null ? new char[]{} : input2.toLowerCase().toCharArray();

		if (input1List.isEmpty() && input2Chars.length == 0) {
			return true;
		} else if (input1List.size() != input2Chars.length) {
			return false;
		}

		boolean rdo = true;
		for(final Character character : input2Chars) {
			if (!input1List.remove(character)) {
				rdo = false;
				break;
			}
		}

		return rdo;
	}
}
