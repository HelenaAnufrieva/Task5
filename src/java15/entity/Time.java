package java15.entity;

public class Time {
    public double time;

    public Time()
    {
        time = 0;
    }
    public void change(double t)
    {
        this.time += t;
    }
    public void change(Time t)
    {
        this.time += t.time;
    }
    public void print()
    {
        System.out.println("Time: " + (long) time/60);
    }
}
