package com.mendas;

/**
 * @author mendas
 * @date 2022年08月26日 11:42 下午
 */
public abstract class Goods {
    private String name;
    protected double quality;
    protected int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

    }

    /**
     * 子类实现
     */
    abstract void updateByDay() ;

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }


    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQuality() {
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
