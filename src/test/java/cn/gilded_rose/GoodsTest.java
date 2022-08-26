package cn.gilded_rose;


import com.mendas.Goods;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mendas
 * @date 2022年08月26日 11:29 下午
 */
public class GoodsTest {


    /**
     * given 没有过保,价值大于0 when按天更新 then保质期和价值都减1
     */
    @Test
    void test() {
        double oldQuality = 5;
        int oldSellIn = 1;
        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality - 1);
        assertEquals(newSellIn, oldSellIn - 1);

    }


    /**
     * given 没有过保 价值等于0 when按天更新 then 保质期减1 价值为0
     */
    @Test
    void test2() {
        double oldQuality = 0;
        int oldSellIn = 1;
        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality);
        assertEquals(newSellIn, oldSellIn - 1);

    }


    /**
     * .given 过保 价值大于1 when按天更新 then 保质期减1 价值为2
     */
    @Test
    void test3() {
        double oldQuality = 5;
        int oldSellIn = 0;
        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality-2);
        assertEquals(newSellIn, oldSellIn - 1);

    }

    /**
     *given 过保 价值等于1 when按天更新 then 保质期减1  价值0
     */
    @Test
    void test4() {
        double oldQuality = 1;
        int oldSellIn = 0;
        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, 0);
        assertEquals(newSellIn, oldSellIn - 1);

    }

}
