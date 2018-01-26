package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 17/1/11.
 */
public class Salesman {
    private String name;
    private ProductManager productManager;

    public Salesman(String name, ProductManager productManager) {
        this.name = name;
        this.productManager = productManager;
    }

    public void putDemand() {
        System.out.println(name + "提出了新需求");
        productManager.receive(new Demand(productManager.chooseProgrammer()));
    }

    public void putBug() {
        System.out.println(name + "提出了新bug");
        productManager.receive(new Bug(productManager.chooseProgrammer()));
    }

    public void putProblem() {
        System.out.println(name + "遇到问题");
        productManager.receive(new Problem(productManager.chooseProgrammer()));
    }
}
