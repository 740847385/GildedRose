package com.mendas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mendas
 * @date 2022年08月27日 12:46 上午
 */
public class AgedBrieTest {
    /**
     * given 没有过保,价值小于50 when按天更新 then保质期减1 价值加1
     */
    @Test
    void test() {
        double oldQuality = 45;
        int oldSellIn = 1;
        Goods goods = new AgedBries("Aged Brie", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality + 1);
        assertEquals(newSellIn, oldSellIn - 1);
    }


    /**
     * given 没有过保,价值等于50 when按天更新 then保质期减1 价值任为50
     */
    @Test
    void test2() {
        double oldQuality = 50;
        int oldSellIn = 1;
        Goods goods = new AgedBries("Aged Brie", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 50);
        assertEquals(newSellIn, oldSellIn - 1);
    }


    /**
     * given 过保,价值小于49 when按天更新 then保质期减1 价值加2
     */
    @Test
    void test3() {
        double oldQuality = 45;
        int oldSellIn = 0;
        Goods goods = new AgedBries("Aged Brie", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality+2);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     *given 过保,价值等于49 when按天更新 then保质期减1 价值加50
     */
    @Test
    void test4() {
        double oldQuality = 49;
        int oldSellIn = 0;
        Goods goods = new AgedBries("Aged Brie", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 50);
        assertEquals(newSellIn, oldSellIn - 1);
    }

}
