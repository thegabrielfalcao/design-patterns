package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.builder.PessoaBuilder;
import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.director.Director;
import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        //Utilizando o builders diretamente para criar uma pessoa
        PessoaBuilder builder = new PessoaBuilder(new Pessoa());
        builder.comNome("Roberto").comAltura(2.).comCorDosOlhos("Azul").comEtnia("Afrodescendente").comPeso(75.);
        Pessoa pessoa = builder.build();
        System.out.println(pessoa);

        //Agora usaremos a classe Director, onde podemos ter perfis pré-definidos
        builder = new PessoaBuilder(new Pessoa());
        Director director = new Director(builder);

        //Primeiro uma pessoa obesa
        director.buildFatPerson();
        Pessoa fatPerson = builder.build();
        System.out.println(fatPerson);

        //Agora criaremos o Bruce Wayne (ou será o Batman)1
        director.buildBruceWayne();
        Pessoa batman = builder.build();
        System.out.println(batman);
    }
}
