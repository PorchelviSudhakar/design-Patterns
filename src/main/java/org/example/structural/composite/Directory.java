package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;

    List<FileSystem> fileSystemList;
    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name is "+directoryName);
        for(FileSystem fileSystem: fileSystemList) {
            fileSystem.ls();
        }
    }
}
