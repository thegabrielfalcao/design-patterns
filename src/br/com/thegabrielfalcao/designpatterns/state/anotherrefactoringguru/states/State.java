package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model.Document;

public abstract class State {

    protected Document document;

    public State(Document document) {
        this.document = document;
    }

    public abstract void publish();
}
