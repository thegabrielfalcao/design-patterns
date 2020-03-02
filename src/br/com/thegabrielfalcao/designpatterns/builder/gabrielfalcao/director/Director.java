package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.director;

import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.builder.PessoaBuilder;

public class Director {

    private PessoaBuilder builder;

    public Director(PessoaBuilder builder) {
        this.builder = builder;
    }

    public void buildFatPerson() {
        builder.comPeso(250.0).comNome("Fat Person").comAltura(1.5);
    }

    /**
     * Informações retiradas do Wikipedia ;)
     */
    public void buildBruceWayne() {
        builder.comNome("Bruce Wayne").comSexo('M').comPeso(95.0).comAltura(1.88).isTrabalhando(true).isPCD(false).comEtnia("Caucasiano").comCorDosOlhos("Preto");
    }

    public PessoaBuilder getBuilder() {
        return builder;
    }
}
