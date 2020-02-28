package br.com.thegabrielfalcao.designpatterns.builder.gabrielfalcao.model;

import java.time.LocalDate;

public class Pessoa {

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public boolean isTrabalhando() {
        return isTrabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        isTrabalhando = trabalhando;
    }

    public boolean isPCD() {
        return isPCD;
    }

    public void setPCD(boolean PCD) {
        isPCD = PCD;
    }

    public Boolean getTrabalhando() {
        return isTrabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        isTrabalhando = trabalhando;
    }

    public Boolean getPCD() {
        return isPCD;
    }

    public void setPCD(Boolean PCD) {
        isPCD = PCD;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", isTrabalhando=" + isTrabalhando +
                ", isPCD=" + isPCD +
                ", corDosOlhos='" + corDosOlhos + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", etnia='" + etnia + '\'' +
                '}';
    }
}
