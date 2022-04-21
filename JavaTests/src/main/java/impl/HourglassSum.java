package impl;

import java.util.List;

public class HourglassSum {
    public int solution(final List<List<Integer>> arr) {
        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int hourglassSum = arr.get(i).get(j) +
                                            arr.get(i).get(j+1) +
                                                arr.get(i).get(j+2) +
                                        arr.get(i+1).get(j+1) +
                                        arr.get(i+2).get(j) +
                                            arr.get(i+2).get(j+1) +
                                                arr.get(i+2).get(j+2);

                if (hourglassSum > maxHourglassSum) {
                    maxHourglassSum = hourglassSum;
                }
            }
        }

        return maxHourglassSum;
    }
}
