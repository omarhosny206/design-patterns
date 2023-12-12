package behavioral.memento;

public class Editor {
    private String content;

    public Editor() {
        this.content = "";
    }

    public Editor(String content) {
        this.content = content;
    }

    public EditorState save(String content) {
        setContent(this.getContent() + "\n" + content);
        return new EditorState(this.getContent());
    }

    public void restore(EditorState editorState) {
        setContent(editorState.getContent());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}