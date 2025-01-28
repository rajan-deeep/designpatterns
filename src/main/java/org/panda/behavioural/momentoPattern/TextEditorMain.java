package org.panda.behavioural.momentoPattern;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker(); //History / StateMgmt

        editor.write("A");
        caretaker.saveSate(editor);

        editor.write("B");
        caretaker.saveSate(editor);
        //Problem - > Undo the last write!
        editor.write("C");
        caretaker.saveSate(editor);

        //CareTaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
