package br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.model;

public class Segurado {

    private String nome;
    private Integer idade;

    public Segurado(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
