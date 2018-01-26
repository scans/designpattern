package cn.coolcc.designPatterns.strategy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chencheng on 17/1/8.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRegion {
    int max() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;

    int order() default 0;
}
