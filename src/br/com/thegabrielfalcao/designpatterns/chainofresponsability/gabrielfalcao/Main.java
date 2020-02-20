package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.Machine;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int productValue = 100;

        do {
            System.out.println("Insert a coin:");

            Coin coin = new Coin(scanner.nextInt());

            Machine machine = new Machine();

            int coinPicked = machine.pick(coin);

            productValue -= coinPicked;

            if (productValue < 0) {
                System.out.println("Your change: [" + productValue * -1 + "]");
                productValue = 0;
            }
        } while (productValue != 0);

    }
}
