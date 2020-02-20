package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.FiftyCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.FiveCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.TenCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.TwentyFiveCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public class Machine {

    private CoinCollector coinCollector;

    public Machine() {
        coinCollector = new FiveCoinCollector();
        coinCollector.linkWith(new TenCoinCollector()).linkWith(new TwentyFiveCoinCollector()).linkWith(new FiftyCoinCollector()).linkWith(new HundredCoinCollector());
    }

    public int pick(Coin coin) {
        return this.coinCollector.pickCoin(coin);
    }
}
