package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ALetterAppearBeforeBLetterTest {

    private ALetterAppearBeforeBLetter ALetterAppearBeforeBLetter;

    @BeforeEach
    public void initialSetUp() {
        this.ALetterAppearBeforeBLetter = new ALetterAppearBeforeBLetter();
    }

    @Test
    public void test1() {
        Assertions.assertTrue(this.ALetterAppearBeforeBLetter.solution("aabbb"));
    }

    @Test
    public void test2() {
        Assertions.assertFalse(this.ALetterAppearBeforeBLetter.solution("ba"));
    }

    @Test
    public void test3() {
        Assertions.assertTrue(this.ALetterAppearBeforeBLetter.solution("aaa"));
    }

    @Test
    public void test4() {
        Assertions.assertTrue(this.ALetterAppearBeforeBLetter.solution("b"));
    }

    @Test
    public void test5() {
        Assertions.assertFalse(this.ALetterAppearBeforeBLetter.solution("abba"));
    }
}
