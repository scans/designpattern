package cn.coolcc.designPatterns.strategy.strategys;

import cn.coolcc.designPatterns.strategy.CalPrice;
import cn.coolcc.designPatterns.strategy.annotations.OnceValidRegion;
import cn.coolcc.designPatterns.strategy.annotations.ValidRegion;

/**
 * Created by chencheng on 17/1/18.
 */
@OnceValidRegion(@ValidRegion(min = 2000, order = 10))
public class OverTwoReduceFour implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice - 400;
    }
}
