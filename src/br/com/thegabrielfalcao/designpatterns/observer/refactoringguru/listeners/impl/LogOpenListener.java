package br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners.impl;

import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners.EventListener;

import java.io.File;

// Concrete subscribers react to updates issued by the publisher
// they are attached to.
public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(File log) {
        this.log = log;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
