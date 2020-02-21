package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;
import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl.CaixaAltaDecorador;
import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl.InvertidoDecorador;
import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl.TageamentoDecorador;
import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl.TextoComponente;

public class Client {
    public static void main(String[] args) {

        String texto = "Testando se o texto mudará seu comportamento";

        Campo campo = new CaixaAltaDecorador(new InvertidoDecorador(new TageamentoDecorador(new TextoComponente())));
        String textoAlterado = campo.getTexto(texto);

        System.out.println("Retornando apenas o texto normal");
        System.out.println(new TextoComponente().getTexto(texto));

        Campo campo2 = new InvertidoDecorador(new TageamentoDecorador(new TextoComponente()));
        System.out.println("\nRetornando o texto apenas com tags e invertido");
        System.out.println(campo2.getTexto(texto));

        System.out.println("\nTexto alterado com todos os decorators (Inverter, caixa alta e tag):");
        System.out.println(textoAlterado);
    }
}
