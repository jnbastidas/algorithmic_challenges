package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class AnagramString {
	public boolean areAnagramString(final String input1, final String input2) {


		final List<Character> input1List = input1 == null ? new ArrayList<>() : input1.replace(" ", "").toLowerCase(Locale.ROOT).chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		final char[] input2Chars = input2 == null ? new char[]{} : input2.replace(" ", "").toLowerCase(Locale.ROOT).toCharArray();

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
