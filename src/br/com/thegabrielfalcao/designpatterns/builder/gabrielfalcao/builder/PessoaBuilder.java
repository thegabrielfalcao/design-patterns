package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.builder;

import br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.model.Pessoa;

import java.time.LocalDate;

public class PessoaBuilder {

    private String nome;
    private LocalDate nascimento;
    private String cpf;
    private Character sexo;
    private Boolean isTrabalhando;
    private Boolean isPCD;
    private String corDosOlhos;
    private Double peso;
    private Double altura;
    private String etnia;

    public PessoaBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder comDataDeNascimento(LocalDate dataNascimento) {
        this.nascimento = dataNascimento;
        return this;
    }

    public PessoaBuilder comCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder comSexo(Character sexo) {
        this.sexo = sexo;
        return this;
    }

    public PessoaBuilder isTrabalhando(Boolean isTrabalhando) {
        this.isTrabalhando = isTrabalhando;
        return this;
    }

    public PessoaBuilder isPCD(Boolean isPCD) {
        this.isPCD = isPCD;
        return this;
    }

    public PessoaBuilder comCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
        return this;
    }

    public PessoaBuilder comPeso(Double peso) {
        this.peso = peso;
        return this;
    }

    public PessoaBuilder comAltura(Double altura) {
        this.altura = altura;
        return this;
    }

    public PessoaBuilder comEtnia(String etnia) {
        this.etnia = etnia;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, nascimento, cpf, sexo, isTrabalhando, isPCD, corDosOlhos, peso, altura, etnia);
    }

    public void reset() {
        this.nome           = null;
        this.nascimento     = null;
        this.cpf            = null;
        this.sexo           = null;
        this.isTrabalhando  = null;
        this.isPCD          = null;
        this.corDosOlhos    = null;
        this.peso           = null;
        this.altura         = null;
        this.etnia          = null;
    }
}
