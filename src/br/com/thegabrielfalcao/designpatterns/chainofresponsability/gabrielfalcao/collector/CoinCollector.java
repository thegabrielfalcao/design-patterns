package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public abstract class CoinCollector {

    private CoinCollector nextCoinCollector;

    public CoinCollector linkWith(CoinCollector coinCollector) {
        this.nextCoinCollector = coinCollector;
        return coinCollector;
    }

    public abstract int pickCoin(Coin coin);

    protected int nextPickCoin(Coin coin) {

        if (nextCoinCollector == null) {
            System.out.println("Invalid coin!");
            return 0;
        }

        return nextCoinCollector.pickCoin(coin);
    }
}
