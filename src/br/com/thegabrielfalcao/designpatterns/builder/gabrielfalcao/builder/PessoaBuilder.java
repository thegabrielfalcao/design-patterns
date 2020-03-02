package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.builder;

import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.model.Pessoa;

import java.time.LocalDate;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaBuilder comNome(String nome) {
        pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder comDataDeNascimento(LocalDate dataNascimento) {
        pessoa.setNascimento(dataNascimento);
        return this;
    }

    public PessoaBuilder comCpf(String cpf) {
        pessoa.setCpf(cpf);
        return this;
    }

    public PessoaBuilder comSexo(Character sexo) {
        pessoa.setSexo(sexo);
        return this;
    }

    public PessoaBuilder isTrabalhando(Boolean isTrabalhando) {
        pessoa.setTrabalhando(isTrabalhando);
        return this;
    }

    public PessoaBuilder isPCD(Boolean isPCD) {
        pessoa.setPCD(isPCD);
        return this;
    }

    public PessoaBuilder comCorDosOlhos(String corDosOlhos) {
        pessoa.setCorDosOlhos(corDosOlhos);
        return this;
    }

    public PessoaBuilder comPeso(Double peso) {
        pessoa.setPeso(peso);
        return this;
    }

    public PessoaBuilder comAltura(Double altura) {
        pessoa.setAltura(altura);
        return this;
    }

    public PessoaBuilder comEtnia(String etnia) {
        pessoa.setEtnia(etnia);
        return this;
    }

    public Pessoa build() {
        return this.pessoa;
    }
}
