package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.CoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public class TwentyFiveCoinCollector extends CoinCollector {

    @Override
    public int pickCoin(Coin coin) {

        if (coin.getValue() == 25) {
            System.out.println("Picking coin [25]");
            return coin.getValue();
        }

        return nextPickCoin(coin);
    }
}
