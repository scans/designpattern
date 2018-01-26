package cn.coolcc.designPatterns.decorator;

/**
 * Created by chencheng on 17/1/10.
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("默认方法行为");
    }
}
