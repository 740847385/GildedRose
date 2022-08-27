package cn.gilded_rose;

import com.mendas.Goods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mendas
 * @date 2022年08月28日 12:39 上午
 */
public class BackstagePassTest {
    /**
     * 提前10天以上 价值小于50 when按天更新 then保质期减1 价值加1
     */
    @Test
    void test() {
        double oldQuality = 45;
        int oldSellIn = 11;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality + 1);
        assertEquals(newSellIn, oldSellIn - 1);
    }


    /**
     * 提前10天以上 价值等于50 when按天更新 then保质期减1 价值仍为50
     */
    @Test
    void test2() {
        double oldQuality = 50;
        int oldSellIn = 11;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 50);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     * 提前5~10天以上 价值小于49 when按天更新 then保质期减1 价值加2
     */
    @Test
    void test3() {
        double oldQuality = 45;
        int oldSellIn = 6;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality + 2);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     * 提前5~10天以上 价值等于49 when按天更新 then保质期减1 价值仍为50
     */
    @Test
    void test4() {
        double oldQuality = 49;
        int oldSellIn = 6;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 50);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     * 提前5天以内 价值小于48 when按天更新 then保质期减1 价值加3
     */
    @Test
    void test5() {
        double oldQuality = 45;
        int oldSellIn = 3;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality + 3);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     * 提前5天以内 价值等于48 when按天更新 then保质期减1 价值为50
     */
    @Test
    void test6() {
        double oldQuality = 48;
        int oldSellIn = 3;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 50);
        assertEquals(newSellIn, oldSellIn - 1);
    }

    /**
     *过保 价值0~50任意值 when按天更新 then保质期减1 价值为0
     */
    @Test
    void test7() {
        double oldQuality = 48;
        int oldSellIn = 0;
        Goods goods = new Goods("Backstage pass", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 0);
        assertEquals(newSellIn, oldSellIn - 1);
    }
}
