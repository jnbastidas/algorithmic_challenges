package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileCollectionsTest {
    private FileCollections fileCollections;

    @BeforeEach
    public void initSetUp() {
        this.fileCollections = new FileCollections();
    }

    @Test
    public void test1() {
        final MyFile myFile1 = new MyFile(100, null);
        final MyFile myFile2 = new MyFile(200, "Collection1");
        final MyFile myFile3 = new MyFile(200, "Collection1");
        final MyFile myFile4 = new MyFile(300, "Collection2");
        final MyFile myFile5 = new MyFile(10, null);

        Assertions.assertEquals(810 , this.fileCollections.totalSizeAllFilesStored(new MyFile[]{myFile1, myFile2, myFile3, myFile4, myFile5}));
    }

    @Test
    public void test2() {
        final MyFile myFile1 = new MyFile(100, null);
        final MyFile myFile2 = new MyFile(600, "Collection1");
        final MyFile myFile3 = new MyFile(400, "Collection1");
        final MyFile myFile4 = new MyFile(500, "Collection2");
        final MyFile myFile5 = new MyFile(10, null);
        final MyFile myFile6 = new MyFile(1500, "Collection4");
        final MyFile myFile7 = new MyFile(400, "Collection3");

        final int n = 2;

        final List<String> rdo = this.fileCollections.getTopNCollections(new MyFile[]{myFile1, myFile2, myFile3, myFile4, myFile5, myFile6, myFile7}, n);
        Assertions.assertEquals(2 , rdo.size());
        Assertions.assertEquals("Collection4" , rdo.get(0));
        Assertions.assertEquals("Collection1" , rdo.get(1));
    }
}
