package impl;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class LongestSubstringWithoutRepeatingCharacters {
	public String getTheLongestSubstringWithoutRepeatingCharacters(final String input) {
		if (input == null) {
			return null;
		}

		// O(nˆ2) Cuadratic solution
		//return this.cuadraticSoution(input);

		// O(n) Lineal solution
		return this.linealSolution(input);
	}

	private String linealSolution(final String input) {
		int i = 0;
		int j = 0;
		final int n = input.length() - 1;
		final Set<Character> visitedCharacters = new LinkedHashSet<>();
		while(i <= n && j <= n) {
			final Character inCharacter = input.charAt(j);
			if (visitedCharacters.add(inCharacter)) {
				j++;

				// To go saving the first coincidence
				/*final String currentSubString = input.substring(i, j);
				if (longestSubString.length() < currentSubString.length()) {
					longestSubString = currentSubString;
				}*/
			} else {
				visitedCharacters.remove(inCharacter);
				i++;
			}
		}

		return visitedCharacters.stream().map(c -> String.valueOf((char)c)).collect(Collectors.joining());
	}

	private String cuadraticSoution(final String input) {
		String longestSubString = "";
		for(int p = 0; p < input.length() - 1; p++) {
			final String currentSubString = this.getLongestStr(input.substring(p));
			if (longestSubString.length() < currentSubString.length()) {
				longestSubString = currentSubString;
			}

			if (currentSubString.length() == input.length() - p) {
				break;
			}
		}

		return longestSubString;
	}

	private String getLongestStr(final String subStringToEvaluate) {
		String currentLongestStr = "";
		for(int p = 0; p <= subStringToEvaluate.length() - 1; p++) {
			final Character inCharacter = subStringToEvaluate.charAt(p);
			if (currentLongestStr.indexOf(inCharacter) == -1) {
				currentLongestStr = currentLongestStr.concat(String.valueOf(inCharacter));
			} else {
				return currentLongestStr;
			}
		}

		return currentLongestStr;
	}
}
