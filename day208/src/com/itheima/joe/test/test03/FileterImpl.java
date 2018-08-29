package com.itheima.joe.test.test03;

import java.io.File;
import java.io.FilenameFilter;

public class FileterImpl implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt") || new File(dir,name).isDirectory();
    }
}
