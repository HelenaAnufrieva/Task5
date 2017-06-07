package java15.entity.Cahseir;

import java15.entity.Money;
import java15.entity.Time;

public class NormalworkingCashier extends ACashier {

    public NormalworkingCashier(String name) {
        super(name);
        speedOfWork = 1;
        timeOfWork = new Time();
    }

    @Override
    public Time getTime() {
        return timeOfWork;
    }

    @Override
    public void getMoney(Money sum) {
        Money empty = new Money();
        if (sum != empty) {
            timeOfWork.change(46);
        }
        else System.out.println("Error");
    }
}
