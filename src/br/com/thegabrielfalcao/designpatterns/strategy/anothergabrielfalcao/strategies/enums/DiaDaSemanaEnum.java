package br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.enums;

import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.MensagemDoDia;
import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.impl.*;

public enum DiaDaSemanaEnum {

    DOMINGO(1, new Domingo()),
    SEGUNDA(2, new Segunda()),
    TERCA(3, new Terca()),
    QUARTA(4, new Quarta()),
    QUINTA(5, new Quinta()),
    SEXTA(6, new Sexta()),
    SABADO(0, new Sabado());

    private int id;
    private MensagemDoDia mensagem;

    DiaDaSemanaEnum(int id, MensagemDoDia mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public int getId() {
        return this.id;
    }

    public MensagemDoDia getMensagem() {
        return mensagem;
    }

    public static MensagemDoDia getInstanceById(int id) {
        for(DiaDaSemanaEnum dia : DiaDaSemanaEnum.values()) {
            if (dia.getId() == id) {
                return dia.getMensagem();
            }
        }

        return null;
    }
}
