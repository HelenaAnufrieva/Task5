package java15.entity.Customer;

import java15.entity.Money;
import java15.entity.Product;
import java15.entity.Time;

public class NormalCustomer extends ACustomer {

    public NormalCustomer(String name, Product[] p, int n) {
        super(name, p, n);
    }

    @Override
    public Product[] giveProd() {
        return listOfGoods;
    }

    @Override
    public Money payForGoods(Money sum) {
        if (this.amount.isGreater(sum)) {
            this.amount.minus(sum);
            timeOfPay.change(2);
            return sum;
        }
        else return new Money();
    }

    @Override
    public Time getTime() {
        return timeOfPay;
    }
}
