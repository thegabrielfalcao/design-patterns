package br.com.thegabrielfalcao.designpatterns.builder.alura.builder;

import br.com.thegabrielfalcao.designpatterns.builder.alura.model.Item;
import br.com.thegabrielfalcao.designpatterns.builder.alura.model.NotaFiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private double valorTotal;
    private double impostos;
    private Calendar data;
    private String observacoes = "";

    private List<Item> todosItens = new ArrayList<Item>();

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(Item item) {
        todosItens.add(item);
        valorTotal += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes += observacoes;
        return this;
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorTotal, impostos, todosItens, observacoes);
    }

}
