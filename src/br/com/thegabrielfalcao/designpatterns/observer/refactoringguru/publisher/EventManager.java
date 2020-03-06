package br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.publisher;

import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// The base publisher class includes subscription management
// code and notification methods.
public class EventManager {

    //Esse map será inicializado contendo operações onde os listeners irão se inscrever
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager (String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
