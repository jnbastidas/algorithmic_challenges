/**
 Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
 Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

 Examples

 - "mom"
    [m, m] [mo, om]

 - "abba"
    [a,a] [ab,ba] [b,b] [abb, bba]
 */

package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PairsOfSubstringsAreAnagrams {
    public long sherlockAndAnagrams(final String s) {
        final List<StringPair> stringPairList = new ArrayList<>();
        for (int subStringLength = 1; subStringLength <= s.length() - 1; subStringLength++) {
            for (int i = 0; i < s.length() - subStringLength ; i++) {
                final String baseSubstring = s.substring(i, i + subStringLength);
                final String complementSubstring = s.substring(i + 1);

                stringPairList.addAll(this.getStringPairList(baseSubstring, complementSubstring));
            }
        }

        //final Map<StringPair, Long> stringPairListGrouped = stringPairList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //return stringPairListGrouped.entrySet().stream().filter(m -> this.areAnagramStrings(m.getKey().getS1(), m.getKey().getS2())).mapToLong(Map.Entry::getValue).sum();
        return stringPairList.stream().filter(sp -> this.areAnagramStrings(sp.s1(), sp.s2())).count();
    }

    private List<StringPair> getStringPairList(final String base, final String complement) {
        final List<StringPair> stringPairList = new ArrayList<>();

        final int subStringLength = base.length();
        for (int i = 0; i <= complement.length() - subStringLength; i++) {
            final String s2 = complement.substring(i, i + subStringLength);
            final StringPair stringPair = new StringPair(base, s2);
            stringPairList.add(stringPair);
        }

        return stringPairList;
    }

    private boolean areAnagramStrings(final String input1, final String input2) {
        final List<Character> input1List = input1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        final char[] input2Chars = input2.toCharArray();

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

record StringPair(String s1, String s2) {

    @Override
    public String toString() {
        return "{" + this.s1 + "," + this.s2 + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(obj instanceof final StringPair stringPair)) {
            return false;
        }

        // Compare the data members and return accordingly
        return stringPair.s1().equals(this.s1) && stringPair.s2().equals(this.s2);
    }
}