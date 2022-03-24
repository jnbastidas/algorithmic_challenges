package impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Largest palindromic number
 */

public class LargestPalindromicNumber {
    private int getIntFromChar(final char c) {
        return c - '0';
    }

    private char getCharFromInt(final int i) {
        return (char)(i + 48);
    }

    public String solution(String S) {
        final int l = S.length();

        final Map<Integer, Integer> digitsGroup = new HashMap<>();

        for (int i = l-1; i >= 0; i--) {
            final int intValue = this.getIntFromChar(S.charAt(i));
            if(digitsGroup.containsKey(intValue)) {
                digitsGroup.put(intValue, digitsGroup.get(intValue) + 1);
            } else {
                digitsGroup.put(intValue, 1);
            }
        }

        int[] largest = new int[l];
        int greatestUnique = 0;
        int pairStart = 0;
        int pairEnd = l-1;
        for (int i = 9; i > 0; i--) {
            if(digitsGroup.containsKey(i) && digitsGroup.get(i)%2==1 && i > greatestUnique) {
                greatestUnique = i;

                digitsGroup.put(i, digitsGroup.get(i)-1);

                if (digitsGroup.get(i) > 0) {
                    i++;
                }
            } else if (digitsGroup.containsKey(i) && digitsGroup.get(i)%2==0) {
                digitsGroup.put(i, digitsGroup.get(i)-2);

                largest[pairStart] = i;
                largest[pairEnd] = i;

                pairStart++;
                pairEnd--;

                if (digitsGroup.get(i) > 0) {
                    i++;
                }
            }
        }

        if (pairEnd-pairStart >= 1) {
            largest[pairStart + 1] = greatestUnique;
        }

        StringBuilder rdo = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (largest[i] > 0) {
                rdo.append(this.getCharFromInt(largest[i]));
            }
        }

        return (rdo.length() == 0) ? "0" : rdo.toString();
    }
}
