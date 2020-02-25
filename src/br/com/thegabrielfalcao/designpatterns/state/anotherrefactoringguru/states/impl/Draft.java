package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.impl;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.Document;
import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.State;

public class Draft extends State {

    public Draft(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        if (document.isWriterAdmin()) {
            System.out.println("Publishing document...");
            document.changeState(new Published(document));
        } else {
            System.out.println("Writer not an admin. Sending to moderation approval...");
            document.changeState(new Moderation(document));
        }
    }
}
