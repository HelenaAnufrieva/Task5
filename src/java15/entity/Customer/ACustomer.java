package java15.entity.Customer;

import java15.entity.Human;
import java15.entity.Money;
import java15.entity.Product;
import java15.entity.Time;

import java.util.Random;

public abstract class ACustomer extends Human implements Customer{
    public Product[] listOfGoods;
    public Money amount;
    public Time timeOfPay;

    public ACustomer(String name, Product[] p, int n) {
        super(name);
        Random random = new Random();
        listOfGoods = new Product[n];
        for (int i = 0; i < n; i++)
            listOfGoods[i] = p[i];
        amount = new Money(random.nextInt(30), random.nextInt(99));
        timeOfPay = new Time();
    }

    public Product[] giveProd()
    {
        return listOfGoods;
    }

    public abstract Money payForGoods(Money sum);
}
