package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.CoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public class FiveCoinCollector extends CoinCollector {

    @Override
    public int pickCoin(Coin coin) {

        if (coin.getValue() == 5) {
            System.out.println("Picking coin [5]");
            return coin.getValue();
        }

        return nextPickCoin(coin);
    }
}
