package com.mendas;

/**
 * @author mendas
 * @date 2022年08月26日 11:42 下午
 */
public class Goods {

    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.sellIn = sellIn;
        this.quality = quality;

    }

    public void updateByDay() {

        decreaseQuality();

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            decreaseQuality();
        }

    }


    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public double getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }


}
