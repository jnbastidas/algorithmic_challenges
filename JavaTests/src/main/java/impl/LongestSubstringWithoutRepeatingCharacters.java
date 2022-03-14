package impl;

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
		String longestSubString = "";
		int i = 0;
		int j = 0;
		final int n = input.length() - 1;
		String visitedCharacters = "";

		int lastPositionRemoved = 0;
		while(i <= n && j <= n) {
			final char inCharacter = input.charAt(j);
			if (!visitedCharacters.contains(String.valueOf(inCharacter))) {
				visitedCharacters = visitedCharacters.concat(String.valueOf(inCharacter));
				j++;

				// Go keeping the bigest first coincidence
				final String currentSubString = input.substring(i, j);
				if (longestSubString.length() < currentSubString.length()) {
					longestSubString = currentSubString;
				}
			} else {
				final int inCharacterPos = visitedCharacters.indexOf(inCharacter);
				visitedCharacters = visitedCharacters.substring(inCharacterPos + 1);
				lastPositionRemoved = lastPositionRemoved + inCharacterPos;

				i = i + lastPositionRemoved + 1;
			}
		}

		return longestSubString;
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
