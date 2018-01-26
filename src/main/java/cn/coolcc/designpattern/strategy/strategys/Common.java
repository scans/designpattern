package cn.coolcc.designPatterns.strategy.strategys;

import cn.coolcc.designPatterns.strategy.CalPrice;
import cn.coolcc.designPatterns.strategy.annotations.TotalValidRegion;
import cn.coolcc.designPatterns.strategy.annotations.ValidRegion;

/**
 * Created by chencheng on 17/1/8.
 */
@TotalValidRegion(@ValidRegion(max = 1000))
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}
