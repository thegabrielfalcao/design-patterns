package br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.model.Loja;
import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.model.Produto;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();
        Produto produto = new Produto("iPhone 11", 4000.5);

        loja.anunciar(produto);
    }
}
