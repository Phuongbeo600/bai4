package org.example;

import java.nio.file.Paths;
import java.io.File;

public class FilePathService {
    public String getProjectFolderPath(String root, String subFolder) {
        // Cách 1: Dùng Paths (Khuyên dùng trong Java hiện đại)
        return Paths.get(root, subFolder).toString();

        // Cách 2: Dùng File.separator
        // return root + File.separator + subFolder;
    }
}