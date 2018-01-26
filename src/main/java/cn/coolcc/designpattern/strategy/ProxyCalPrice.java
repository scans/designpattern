package cn.coolcc.designPatterns.strategy;

import java.util.SortedMap;

/**
 * Created by chencheng on 17/1/18.
 */
public class ProxyCalPrice implements CalPrice {

    private SortedMap<Integer, CalPrice> map;

    public ProxyCalPrice(SortedMap<Integer, CalPrice> map) {
        this.map = map;
    }

    @Override
    public Double calPrice(Double originPrice) {
        for (CalPrice calPrice : map.values()) {
            originPrice = calPrice.calPrice(originPrice);
        }
        return originPrice;
    }
}
