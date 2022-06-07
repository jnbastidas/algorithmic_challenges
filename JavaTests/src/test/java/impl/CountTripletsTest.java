package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CountTripletsTest {
    private CountTriplets countTriplets;

    @BeforeEach
    public void initSetUp() {
        this.countTriplets = new CountTriplets();
    }

    @Test
    public void test1() {
        Assertions.assertEquals(2, this.countTriplets.solution(Arrays.asList(1L, 2L, 2L, 4L), 2L));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(6, this.countTriplets.solution(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3L));
    }

    @Test
    public void test3() {
        int rdo = 0;
        int count = 1;
        for (int i = 98; i > 0 ; i--) {
            rdo += i*count;
            count++;
        }

        System.out.println(rdo);

        Assertions.assertEquals(161700, this.countTriplets.solution(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L), 1L));
    }
}
