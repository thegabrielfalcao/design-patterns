package br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.CoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.FiftyCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.FiveCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.TenCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.collector.impl.TwentyFiveCoinCollector;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.gabrielfalcao.model.Coin;

public class Main {

    public static void main(String[] args) {

        Coin coin = new Coin(25);
        CoinCollector coinCollector = new FiveCoinCollector();
        coinCollector.linkWith(new TenCoinCollector()).linkWith(new TwentyFiveCoinCollector()).linkWith(new FiftyCoinCollector());

        coinCollector.pickCoin(coin);
    }
}
