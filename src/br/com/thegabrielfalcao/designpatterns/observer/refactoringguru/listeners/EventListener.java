package br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners;

import java.io.File;

// Here's the subscriber interface. If your programming language
// supports functional types, you can replace the whole
// subscriber hierarchy with a set of functions.
public interface EventListener {

    void update(String eventType, File file);
}
