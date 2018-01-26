package cn.coolcc.designPatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencheng on 17/3/31.
 */
public class AccountBook {
    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void show(Visitor visitor) {
        for (Bill bill : bills) {
            bill.accept(visitor);
        }
    }
}
