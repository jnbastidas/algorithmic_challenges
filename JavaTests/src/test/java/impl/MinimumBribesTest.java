package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinimumBribesTest {
    private MinimumBribes minimumBribes;

    @BeforeEach
    public void initSetUp() {
        this.minimumBribes = new MinimumBribes();
    }

    @Test
    public void test1() {
        Assertions.assertEquals("1", this.minimumBribes.solution(Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8)));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("Too chaotic", this.minimumBribes.solution(Arrays.asList(4, 1, 2, 3)));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("3", this.minimumBribes.solution(Arrays.asList(2, 1, 5, 3, 4)));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("7", this.minimumBribes.solution(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4)));
    }
}
