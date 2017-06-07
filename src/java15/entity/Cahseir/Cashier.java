package java15.entity.Cahseir;

import java15.entity.Money;
import java15.entity.Product;
import java15.entity.Time;

public interface Cashier {
    void getMoney(Money sum);
    Money saySum(Product[] goods, int n);
    Time getTime();
}
