package impl;

public class ReverseString {
	public String getReverseString(final String input) {
		if (input != null) {
			final StringBuilder reverseString = new StringBuilder();
			for(int i = input.length() - 1; i >= 0; i--) {
				reverseString.append(input.charAt(i));
			}

			return reverseString.toString();
		} else {
			return null;
		}
	}
}
