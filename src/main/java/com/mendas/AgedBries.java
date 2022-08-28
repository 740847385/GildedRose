package com.mendas;

/**
 * @author mendas
 * @date 2022年08月28日 10:31 下午
 */
public class AgedBries extends Goods{
    public AgedBries(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateByDay() {
        increaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            increaseQuality();

        }
    }
}
