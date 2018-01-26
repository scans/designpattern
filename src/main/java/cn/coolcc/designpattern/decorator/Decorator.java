package cn.coolcc.designPatterns.decorator;

/**
 * Created by chencheng on 17/1/10.
 */
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
