package com.mendas;

import com.mendas.Goods;

/**
 * @author mendas
 * @date 2022年08月28日 10:36 下午
 */
public class BackstagePass extends Goods {
    public BackstagePass(double quality, int sellIn) {
        super("Backstage pass", quality, sellIn);
    }

    @Override
    public void updateByDay() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();

        }
        if (sellIn < 6) {
            increaseQuality();

        }
        decreaseSellIn();

        if (isExpired()) {
            quality = 0;
        }
    }
}
