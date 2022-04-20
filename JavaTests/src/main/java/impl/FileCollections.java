/*
file1.txt (size: 100)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 10)

For this system we would like to generate a report that lists:
    1. The total size of all files stored.
    2. The top N collections (by file size) where N can be a user-defined value.
*/

package impl;

import java.util.*;
import java.util.stream.Collectors;

public class FileCollections {
    public long totalSizeAllFilesStored(final MyFile[] files) {
        if (files == null) {
            return 0L;
        }

        final List<MyFile> fileList = Arrays.asList(files);
        return fileList.stream().mapToLong(MyFile::getSize).sum();
    }

    public List<String> getTopNCollections(final MyFile[] files, final int n) {
        final List<MyFile> fileList = Arrays.asList(files);

        final Map<String, Long> filesSizeByCollection = fileList.stream().filter(f -> f.getCollectionName() != null ).collect(Collectors.groupingBy(MyFile::getCollectionName, Collectors.summingLong(MyFile::getSize)));

        return filesSizeByCollection.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n).map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

class MyFile {
    private long size;
    private String collectionName;

    public MyFile(long size, String collectionName) {
        this.size = size;
        this.collectionName = collectionName;
    }

    public long getSize() {
        return size;
    }

    public String getCollectionName() {
        return collectionName;
    }
}
