package com.mendas;

/**
 * @author mendas
 * @date 2022年08月26日 11:42 下午
 */
public class Goods {
    private String name;
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

    }

    public void updateByDay() {

        if ("Aged Brie".equals(name)) {
            updateAgedbride();
            return;
        }
        if ("Backstage pass".equals(name)) {
            updateBackstagePass();
            return;
        }
        if ("Sulfuras".equals(name)) {

            return;
        }


        updateRegularGoods();

    }

    private void updateBackstagePass() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();

        }
        if (sellIn < 6) {
            increaseQuality();

        }
        decreaseSellIn();

        if (sellIn < 0) {
            quality = 0;
        }
    }

    private void updateAgedbride() {
        increaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            increaseQuality();

        }
        return;
    }

    private void updateRegularGoods() {
        decreaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }


    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }


    private void decreaseSellIn() {
        sellIn = sellIn - 1;
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
