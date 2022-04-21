package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringsShareCommonSubstringTest {
    private StringsShareCommonSubstring stringsShareCommonSubstring;

    @BeforeEach
    public void initSetUp() {
        this.stringsShareCommonSubstring = new StringsShareCommonSubstring();
    }

    @Test
    public void test1() {
        Assertions.assertEquals("YES", this.stringsShareCommonSubstring.twoString("and", "art"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("NO", this.stringsShareCommonSubstring.twoString("hi", "world"));
    }
}
