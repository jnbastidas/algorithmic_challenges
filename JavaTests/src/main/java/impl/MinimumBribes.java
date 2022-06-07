package impl;

import java.util.List;

public class MinimumBribes {
    public String solution(final List<Integer> q) {
        int movements = 0;
        boolean loopAgain;
        int startI = 0;
        do {
            loopAgain = false;
            for (int i = startI; i < q.size() - 1; i++) {
                if (q.get(i) - i - 1 > 2) {
                    return "Too chaotic";
                }

                final int currentVal = q.get(i);
                final int nextVal = q.get(i + 1);

                if (nextVal < currentVal) {
                    q.set(i + 1, currentVal);
                    q.set(i, nextVal);
                    movements++;
                }

                if (!loopAgain && q.get(i) != i + 1) {
                    loopAgain = true;
                    startI = Math.max(i - 1, 0);
                }
            }
        } while (loopAgain);

        return String.valueOf(movements);
    }
}
