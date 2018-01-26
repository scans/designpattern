package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 17/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("陈诚");
        ProductManager productManager = new ProductManager(programmer);
        Salesman salesmanA = new Salesman("a", productManager);
        Salesman salesmanB = new Salesman("b", productManager);
        Salesman salesmanC = new Salesman("c", productManager);
        Salesman salesmanD = new Salesman("d", productManager);

        salesmanA.putDemand();
        salesmanB.putBug();
        salesmanC.putProblem();
        salesmanD.putBug();

        productManager.assign();

    }
}
