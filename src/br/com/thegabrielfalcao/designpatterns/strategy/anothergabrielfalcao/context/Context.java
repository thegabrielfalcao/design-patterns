package br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.context;

import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.MensagemDoDia;
import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.enums.DiaDaSemanaEnum;

public class Context {

    private MensagemDoDia mensagem;

    public Context(int idDoDia) {
        this.mensagem = DiaDaSemanaEnum.getInstanceById(idDoDia);
    }

    public void escreverMensagemDoDia() {
        System.out.println(mensagem.escreverMensagemDoDia());
    }
}
