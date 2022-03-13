package impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CanonicalPathTest {
	private CanonicalPath canonicalPath;

	@BeforeEach
	public void initialSetUp() {
		this.canonicalPath = new CanonicalPath();
	}

	@Test
	public void test1() {
		final String rdo = this.canonicalPath.getCanonicalPath("/home/");
		Assertions.assertEquals("/home", rdo);
	}

	@Test
	public void test2() {
		final String rdo = this.canonicalPath.getCanonicalPath("/home//foo/");
		Assertions.assertEquals("/home/foo", rdo);
	}

	@Test
	public void test3() {
		final String rdo = this.canonicalPath.getCanonicalPath("/../");
		Assertions.assertEquals("/", rdo);
	}

	@Test
	public void test4() {
		final String rdo = this.canonicalPath.getCanonicalPath("a/./b/../../../c/");
		Assertions.assertEquals("/c", rdo);
	}
}
