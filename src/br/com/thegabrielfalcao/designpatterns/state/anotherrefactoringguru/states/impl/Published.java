package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.impl;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.Document;
import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.State;

public class Published extends State {

    public Published(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        System.out.println("Document on final state [Published]");
    }
}
