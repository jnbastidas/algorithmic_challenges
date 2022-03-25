package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GraphIsCycleTest {

    private GraphIsCycle graphIsCycle;

    @BeforeEach
    public void initialSetUp() {
        this.graphIsCycle = new GraphIsCycle();
    }

    @Test
    public void test1() {
        Assertions.assertTrue(this.graphIsCycle.solution(new int[]{3, 1, 2}, new int[]{2, 3, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertFalse(this.graphIsCycle.solution(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}));
    }

    @Test
    public void test3() {
        Assertions.assertFalse(this.graphIsCycle.solution(new int[]{1, 2, 1}, new int[]{2, 3, 3}));
    }

    @Test
    public void test4() {
        Assertions.assertFalse(this.graphIsCycle.solution(new int[]{1}, new int[]{1}));
    }

    @Test
    public void test5() {
        Assertions.assertFalse(this.graphIsCycle.solution(new int[]{1}, new int[]{2}));
    }
}
