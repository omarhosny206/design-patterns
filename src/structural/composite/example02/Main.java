package structural.composite.example02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent todosFile = new File("todos.txt");
        FileSystemComponent wordFile = new File("word.docx");
        FileSystemComponent javaFile = new File("Main.java");
        DirectoryComponent sideProjectDirectory = new Directory("side project");
        DirectoryComponent developerDirectory = new Directory("developer", List.of(todosFile, wordFile, javaFile, sideProjectDirectory));

        FileSystemComponent bashConfigFile = new File(".bashrc");
        FileSystemComponent zshConfigFile = new File(".zshrc");
        DirectoryComponent ubuntuDirectory = new Directory("ubuntu", List.of(developerDirectory));
        FileSystemComponent rootDirectory = new Directory("root", List.of(bashConfigFile, zshConfigFile, ubuntuDirectory));

        System.out.println(rootDirectory.getInfo());
    }
}
