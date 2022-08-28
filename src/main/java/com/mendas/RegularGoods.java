package com.mendas;



/**
 * @author mendas
 * @date 2022年08月28日 10:18 下午
 */
public class RegularGoods extends Goods {
    public RegularGoods(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateByDay() {
        decreaseQuality();
        decreaseSellIn();

        if (isExpired()) {
            decreaseQuality();
        }
    }


}
