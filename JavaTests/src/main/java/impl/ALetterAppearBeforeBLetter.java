package impl;

/**
 * Given string S consisting of N letters 'a' or 'b'. This should return true if all occurrences of 'a' are before all occurrences of 'b' and return false otherwise.
 * 'b' does not need to occur in S and 'a' does not need to occur in S
 */

public class ALetterAppearBeforeBLetter {
    public boolean solution(String S) {
        if (S == null || S.isEmpty()) {
            return false;
        }

        return !S.contains("ba");
    }
}
