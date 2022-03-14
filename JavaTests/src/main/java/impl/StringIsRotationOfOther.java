package impl;

public class StringIsRotationOfOther {
	public boolean string2IsRotationOfString1(final String input1, final String input2) {
		final String doubleInput1 = input1 == null ? "" : input1.concat(input1);
		return doubleInput1.contains(input2 == null ? "" : input2);
	}
}
