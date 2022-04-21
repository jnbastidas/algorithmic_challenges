package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HourglassSumTest {
    private HourglassSum hourglassSum;

    @BeforeEach
    public void initSetUp() {
        this.hourglassSum = new HourglassSum();
    }

    @Test
    public void test1() {
        final List<Integer> row1 = List.of(-9, -9, -9, 1, 1, 1);
        final List<Integer> row2 = List.of(0, -9,  0,  4, 3, 2);
        final List<Integer> row3 = List.of(-9, -9, -9, 1, 2, 3);
        final List<Integer> row4 = List.of(0,  0,  8, 6, 6, 0);
        final List<Integer> row5 = List.of(0, 0, 0, -2, 0, 0);
        final List<Integer> row6 = List.of( 0, 0, 1, 2, 4, 0);

        final List<List<Integer>> matrix = List.of(row1, row2, row3, row4, row5, row6);

        Assertions.assertEquals(28, this.hourglassSum.solution(matrix));
    }
}
