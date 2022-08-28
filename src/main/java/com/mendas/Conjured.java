package com.mendas;

/**
 *
 * @author mendas
 * @date 2022年08月28日 10:57 下午
 */
public class Conjured extends Goods{
    public Conjured(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    void updateByDay() {

        double temp = quality - 2;
        quality = temp >= 0 ? temp : 0;
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            temp = quality - 2;
            quality = temp >= 0 ? temp : 0;
        }
    }
}
