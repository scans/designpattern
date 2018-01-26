package cn.coolcc.designPatterns.strategy.strategys;

import cn.coolcc.designPatterns.strategy.CalPrice;
import cn.coolcc.designPatterns.strategy.annotations.TotalValidRegion;
import cn.coolcc.designPatterns.strategy.annotations.ValidRegion;

/**
 * Created by chencheng on 17/1/8.
 */
@TotalValidRegion(@ValidRegion(min = 3000))
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * .7;
    }
}
