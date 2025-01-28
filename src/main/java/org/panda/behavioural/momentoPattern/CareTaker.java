package org.panda.behavioural.momentoPattern;

import java.util.Stack;

public class CareTaker {

    public Stack<EditorMomento> history = new Stack<>();

    public void saveSate(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!history.empty()){
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
