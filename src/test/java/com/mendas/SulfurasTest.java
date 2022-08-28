package com.mendas;

import com.mendas.Goods;
import com.mendas.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mendas
 * @date 2022年08月28日 2:18 上午
 */
public class SulfurasTest {

    /**
     * 保质期大于0 价值为0~50的任意值,when 按天更新 then 保质期和价值均不变
     */
    @Test
    void test() {
        double oldQuality = 5;
        int oldSellIn = 1;
        Goods goods = new Sulfuras("Sulfuras", oldQuality, oldSellIn);
        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertEquals(newQuality, oldQuality);
        assertEquals(newSellIn, oldSellIn);

    }

}
