package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.impl;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.Document;
import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.State;

public class Moderation extends State {

    public Moderation(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        if (document.isWriterAdmin()) {
            System.out.println("Document approved! Publishing...");
            document.changeState(new Published(document));
        } else {
            System.out.println("Writer not an admin. Still waiting moderation approval...");
        }
    }
}
