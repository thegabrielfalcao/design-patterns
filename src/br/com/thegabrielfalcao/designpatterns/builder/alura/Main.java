package br.com.thegabrielfalcao.designpatterns.builder.alura;

import br.com.thegabrielfalcao.designpatterns.builder.alura.builder.NotaFiscalBuilder;
import br.com.thegabrielfalcao.designpatterns.builder.alura.model.Item;
import br.com.thegabrielfalcao.designpatterns.builder.alura.model.NotaFiscal;

public class Main {
    public static void main(String[] args) {

        NotaFiscal nota = new NotaFiscalBuilder()
                .comCnpj("123.456.789/0001-10")
                .comObservacoes("Observação")
                .comDataAtual()
                .comObservacoes("... mais uma observação")
                .comItem(new Item("Item 1", 220.))
                .constroi();

        System.out.println(nota);
    }
}
