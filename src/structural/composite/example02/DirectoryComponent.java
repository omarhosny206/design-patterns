package structural.composite.example02;

import java.util.List;

public interface DirectoryComponent extends FileSystemComponent {
    void add(FileSystemComponent fileSystemComponent);

    void addAll(List<FileSystemComponent> fileSystemComponent);

    void remove(FileSystemComponent fileSystemComponent);
}
