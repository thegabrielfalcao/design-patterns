package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model;

import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.State;
import br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.states.impl.Draft;

public class Document {

    private State state;
    private User writer;

    public Document(User writer) {
        this.state = new Draft(this);
        this.writer = writer;
    }

    public void publish() {
        state.publish();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean isWriterAdmin() {
        return writer.isAdmin();
    }

    public void changeWriter(User writer) {
        this.writer = writer;
    }

}
