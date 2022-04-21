package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PairsOfSubstringsAreAnagramsTest {
    private PairsOfSubstringsAreAnagrams pairsOfSubstringsAreAnagrams;

    @BeforeEach
    public void initSetUp() {
        this.pairsOfSubstringsAreAnagrams = new PairsOfSubstringsAreAnagrams();
    }

    @Test
    public void Test1() {
        Assertions.assertEquals(2L, this.pairsOfSubstringsAreAnagrams.sherlockAndAnagrams("mom"));
    }

    @Test
    public void Test2() {
        Assertions.assertEquals(4L, this.pairsOfSubstringsAreAnagrams.sherlockAndAnagrams("abba"));
    }

    @Test
    public void Test3() {
        Assertions.assertEquals(0L, this.pairsOfSubstringsAreAnagrams.sherlockAndAnagrams("abcd"));
    }

    @Test
    public void Test4() {
        Assertions.assertEquals(3L, this.pairsOfSubstringsAreAnagrams.sherlockAndAnagrams("ifailuhkqq"));
    }

    @Test
    public void Test5() {
        Assertions.assertEquals(10L, this.pairsOfSubstringsAreAnagrams.sherlockAndAnagrams("kkkk"));
    }
}
