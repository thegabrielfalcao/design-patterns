package br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.publisher;

import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notificar() {
        subscribers.forEach((subscriber -> {
            subscriber.notificar();
        }));
    }
}
