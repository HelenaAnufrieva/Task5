package java15.entity.Cahseir;

import java15.entity.Money;
import java15.entity.Time;

public class HardworkingCashier extends ACashier {

    public HardworkingCashier(String name) {
        super(name);
        speedOfWork = 1.8;
        timeOfWork = new Time();
    }

    @Override
    public void getMoney(Money sum) {
        Money empty = new Money();
        if (sum != empty) {
            timeOfWork.change(25);
        }
        else System.out.println("Error");
    }

    @Override
    public Time getTime() {
        return timeOfWork;
    }

}
