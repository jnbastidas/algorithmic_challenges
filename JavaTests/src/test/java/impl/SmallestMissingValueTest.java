package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmallestMissingValueTest {
    private SmallestMissingValue atlassianExercise;

    @BeforeEach
    public void initialSetUp() {
        this.atlassianExercise = new SmallestMissingValue();
    }

    @Test
    public void test1() {
        Assertions.assertEquals(3, this.atlassianExercise.solution(new int[] {0, 1, 2, 6, 9}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, this.atlassianExercise.solution(new int[] {4, 5, 10, 11}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(4, this.atlassianExercise.solution(new int[] {0, 1, 2, 3}));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(8, this.atlassianExercise.solution(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 10}));
    }
}