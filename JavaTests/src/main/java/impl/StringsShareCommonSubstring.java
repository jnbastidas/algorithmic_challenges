/**
 Given two strings, determine if they share a common substring. A substring may be as small as one character.

 Example:
 - These share the common substring:
    "and"
    "art"
    Share "a"

 - These do not share a substring:
    "be"
    "cat"
 */

package impl;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringsShareCommonSubstring {
    public String twoString(final String s1, final String s2) {
        if (s1 == null || s2 == null) {
            return "NO";
        }

        // Remove duplicated characters and order
        final Set<Character> s1CharsSet = s1.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        final Set<Character> s2CharsSet = s2.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        for (final Character s1Char : s1CharsSet) {
            if (s2CharsSet.stream().anyMatch(s2char -> s2char.equals(s1Char))) {
                return "YES";
            }
        }

        return "NO";
    }
}
