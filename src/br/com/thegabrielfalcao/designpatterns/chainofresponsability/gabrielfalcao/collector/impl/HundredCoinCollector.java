package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.CoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public class HundredCoinCollector extends CoinCollector {

    @Override
    public int pickCoin(Coin coin) {

        if (coin.getValue() == 100) {
            System.out.println("Picking coin [100]");
            return 100;
        }

        return nextPickCoin(coin);
    }
}
