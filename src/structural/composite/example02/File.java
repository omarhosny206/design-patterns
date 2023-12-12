package structural.composite.example02;

public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "File (" + name + ")";
    }
}
