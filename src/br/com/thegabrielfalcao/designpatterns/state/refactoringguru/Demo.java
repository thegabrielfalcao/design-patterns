package br.com.thegabrielfalcao.designpatterns.state.refactoringguru;

import br.com.thegabrielfalcao.designpatterns.state.refactoringguru.ui.Player;
import br.com.thegabrielfalcao.designpatterns.state.refactoringguru.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
