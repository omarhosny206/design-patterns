package structural.composite.example02;

import java.util.ArrayList;
import java.util.List;

public class Directory implements DirectoryComponent {
    private final String name;
    private final List<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, List<FileSystemComponent> fileSystemComponents) {
        this.name = name;
        addAll(fileSystemComponents);
    }

    @Override
    public void add(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.add(fileSystemComponent);
    }

    @Override
    public void addAll(List<FileSystemComponent> fileSystemComponents) {
        this.fileSystemComponents.addAll(fileSystemComponents);
    }

    @Override
    public void remove(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.remove(fileSystemComponent);
    }

    @Override
    public String getInfo() {
        System.out.println();
        List<String> fileSystemComponentsInfos = fileSystemComponents.stream().map(fileSystemComponent -> fileSystemComponent.getInfo()).toList();
        return "Directory (" + name + ") ==> " + fileSystemComponentsInfos;
    }
}
