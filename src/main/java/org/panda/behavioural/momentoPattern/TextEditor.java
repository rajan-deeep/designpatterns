package org.panda.behavioural.momentoPattern;

public class TextEditor {
    private String content;

    public void write(String msg) {
        this.content = msg;
    }

    public EditorMomento save() {
        return new EditorMomento(this.content);
    }

    public void restore(EditorMomento editorMomento) {
        this.content = editorMomento.getContent();
    }

    public String getContent(){
        return this.content;
    }

}
