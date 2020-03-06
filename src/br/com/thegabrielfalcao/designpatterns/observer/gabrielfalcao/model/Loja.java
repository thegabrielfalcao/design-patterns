package br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.model;

import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.publisher.EventManager;
import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.subscriber.impl.EmailNotifier;
import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.subscriber.impl.SMSNotifier;

public class Loja {

    private EventManager eventManager;

    public Loja() {
        eventManager = new EventManager();
        eventManager.subscribe(new EmailNotifier());
        eventManager.subscribe(new SMSNotifier());
    }

    public void anunciar(Produto produto) {
        System.out.println("Anúncio do produto " + produto.getNome() + " por apenas R$" + produto.getValor());
        eventManager.notificar();
    }

}
