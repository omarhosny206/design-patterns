package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private final List<EditorState> editorStates;

    public EditorHistory() {
        this.editorStates = new ArrayList<>();
    }

    public void save(EditorState editorState) {
        editorStates.add(editorState);
    }

    public EditorState undo() {
        int index = editorStates.size() - 1;
        EditorState lastEditorState = editorStates.get(index);
        editorStates.remove(lastEditorState);
        return editorStates.get(index - 1);
    }
}
