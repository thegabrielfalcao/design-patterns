package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.builder.PessoaBuilder;
import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        PessoaBuilder builder = new PessoaBuilder(new Pessoa());
        builder.comNome("Roberto").comAltura(2.).comCorDosOlhos("Azul").comEtnia("Afrodescendente").comPeso(75.);
        Pessoa pessoa = builder.build();

        System.out.println(pessoa);
    }
}
