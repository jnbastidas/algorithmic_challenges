package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxValueAfterApplyOperationsToArrayTest {
    private MaxValueAfterApplyOperationsToArray maxValueAfterApplyOperationsToArray;

    @BeforeEach
    public void initialSetUp() {
        this.maxValueAfterApplyOperationsToArray = new MaxValueAfterApplyOperationsToArray();
    }

    @Test
    public void test1() {
        final List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(2, 9, 1));
        queries.add(List.of(1, 5, 3));
        queries.add(List.of(4, 8, 7));

        Assertions.assertEquals(11L, this.maxValueAfterApplyOperationsToArray.solution(10, queries));
    }

    @Test
    public void test2() {
        final List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 3, 1));
        queries.add(List.of(3, 5, 2));

        Assertions.assertEquals(3L, this.maxValueAfterApplyOperationsToArray.solution(10, queries));
    }

    @Test
    public void test3() {
        final List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 2, 100));
        queries.add(List.of(2, 5, 100));
        queries.add(List.of(3, 4, 100));

        Assertions.assertEquals(200L, this.maxValueAfterApplyOperationsToArray.solution(5, queries));
    }
}
