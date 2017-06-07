package java15;

import java15.entity.*;
import java15.entity.Cahseir.Cashier;
import java15.entity.Cahseir.HardworkingCashier;
import java15.entity.Cahseir.LazyCashier;
import java15.entity.Cahseir.NormalworkingCashier;
import java15.entity.Customer.Customer;
import java15.entity.Customer.CustomerWithCreditCard;
import java15.entity.Customer.NormalCustomer;
import java.util.Random;

public class Application {

    public Product[] listOfProd(int numderOfGoods)
    {
        Product [] listOfProd;
        Money m = new Money(1,8);
        String [] goods = {"Product1", "Product2", "Product3", "Product4", "Product5", "Product6", "Product7", "Product8", "Product9", "Product10"};
        listOfProd = new Product[numderOfGoods];
        for (int j = 0; j < numderOfGoods; j++) {
            listOfProd[j] = new Product(m.change(), goods[j]);
        }
        return listOfProd;
    }

    public void runShop(Cashier cashier, Customer customer, int numderOfGoods) {
       Time finalTime = new Time();
        for (int i = 0; i < 50; i++) {
            Money sumOfGoods;

            sumOfGoods = cashier.saySum(customer.giveProd(), numderOfGoods);
            cashier.getMoney(customer.payForGoods(sumOfGoods));
            finalTime = customer.getTime();
        }
        finalTime.change(cashier.getTime());
        finalTime.print();
    }


    public void run() {
        System.out.println("Processing time of 50 customers for each cashier:");
        Random random = new Random();

        int numberOfGoods;
        numberOfGoods = random.nextInt(10);
        Customer normalCustomer = new NormalCustomer("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        Cashier Vasiliy = new LazyCashier("Vasiliy");
        System.out.println("Lazy Cashier + Normal Customer");
        runShop(Vasiliy, normalCustomer, numberOfGoods);

        Customer customerWithCCard = new CustomerWithCreditCard("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        Vasiliy = new LazyCashier("Vasiliy");
        System.out.println("Lazy Cashier + Customer with Credit Card");
        runShop(Vasiliy, customerWithCCard, numberOfGoods);

        numberOfGoods = random.nextInt(10);
        Cashier Svetlana = new HardworkingCashier("Svetlana");
        normalCustomer = new NormalCustomer("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        System.out.println("Hard-working Cashier + Normal Customer");
        runShop(Svetlana, normalCustomer, numberOfGoods);


        Svetlana = new HardworkingCashier("Svetlana");
        customerWithCCard = new CustomerWithCreditCard("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        System.out.println("Hard-working Cashier + Customer with Credit Card");
        runShop(Svetlana, customerWithCCard, numberOfGoods);

        numberOfGoods = random.nextInt(10);
        Cashier Innokenty = new NormalworkingCashier("Innokenty");
        normalCustomer = new NormalCustomer("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        System.out.println("Normal Cashier + Normal Customer");
        runShop(Innokenty, normalCustomer, numberOfGoods);

        Innokenty = new NormalworkingCashier("Innokenty");
        customerWithCCard = new CustomerWithCreditCard("Unknown", listOfProd(numberOfGoods), numberOfGoods);
        System.out.println("Normal Cashier + Customer with Credit Card");
        runShop(Innokenty, customerWithCCard, numberOfGoods);
}
}
