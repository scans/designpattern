package cn.coolcc.designPatterns.proxy;

/**
 * Created by chencheng on 17/1/5.
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void save() {
        System.out.println("save entity");
    }
}
