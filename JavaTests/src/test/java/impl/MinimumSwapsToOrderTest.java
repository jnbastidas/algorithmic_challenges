package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimumSwapsToOrderTest {
    private MinimumSwapsToOrder minimumSwapsToOrder;

    @BeforeEach
    public void initialSetUp() {
        this.minimumSwapsToOrder = new MinimumSwapsToOrder();
    }

    @Test
    public void test0() {
        Assertions.assertEquals(5, this.minimumSwapsToOrder.solution(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(3, this.minimumSwapsToOrder.solution(new int[]{1, 3, 5, 2, 4, 6, 7}));
    }
}
