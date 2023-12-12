package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory editorHistory = new EditorHistory();

        editorHistory.save(editor.save("First line"));
        editorHistory.save(editor.save("Second line"));
        editorHistory.save(editor.save("Third line"));

        System.out.println(editor.getContent());

        editor.restore(editorHistory.undo());
        System.out.println(editor.getContent());
        editor.restore(editorHistory.undo());
        System.out.println(editor.getContent());
    }
}
