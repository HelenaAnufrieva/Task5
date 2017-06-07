package java15.entity;

import java.util.Random;

public class Money {
    int dollars;
    int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    public Money change() {
        Random random = new Random();
        Money m = new Money();
        m.dollars = this.dollars * (random.nextInt(4) + 1);
        m.cents = this.cents * (random.nextInt(90) + 1);
        return (m);
    }

    public Money add(Money m) {
        return new Money(this.dollars + m.dollars, this.cents + m.cents);
    }

    public boolean isGreater(Money m) {
        if (this.dollars == m.dollars)
            return (this.cents >= m.cents);
        else if (this.dollars > m.dollars)
            return true;
        else return false;
    }

    public void minus(Money m)
    {
        this.dollars -= m.dollars;
        this.cents -= m.cents;
    }
}
