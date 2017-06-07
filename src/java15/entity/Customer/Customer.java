package java15.entity.Customer;

import java15.entity.Money;
import java15.entity.Product;
import java15.entity.Time;

public interface Customer {
    Product[] giveProd();
    Money payForGoods(Money sum);
    Time getTime();
}
