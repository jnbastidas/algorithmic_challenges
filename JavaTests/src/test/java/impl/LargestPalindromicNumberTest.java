package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestPalindromicNumberTest {

    private LargestPalindromicNumber largestPalindromicNumber;

    @BeforeEach
    public void initialSetUp() {
        this.largestPalindromicNumber = new LargestPalindromicNumber();
    }

    @Test
    public void test1() {
        Assertions.assertEquals("898", this.largestPalindromicNumber.solution("39878"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("9", this.largestPalindromicNumber.solution("00900"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("0", this.largestPalindromicNumber.solution("0000"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("5", this.largestPalindromicNumber.solution("54321"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals("8829288", this.largestPalindromicNumber.solution("822839878"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals("531135", this.largestPalindromicNumber.solution("313551"));
    }

    @Test
    public void test7() {
        Assertions.assertEquals("444", this.largestPalindromicNumber.solution("3444"));
    }

}
