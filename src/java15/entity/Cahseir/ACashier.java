package java15.entity.Cahseir;

import java15.entity.Human;
import java15.entity.Money;
import java15.entity.Product;
import java15.entity.Time;

public abstract class ACashier extends Human implements Cashier {
    double speedOfWork;
    Time timeOfWork;

    public ACashier(String name)
    {
        super(name);
    }

    public abstract void getMoney(Money sum);

    public Money saySum(Product[] goods, int n) {
        Money sum = new Money();
        for(int i = 0; i < n; i++) {
            sum.add(goods[i].price);
            timeOfWork.change(10/speedOfWork);
        }
        return sum;
    }
}
