package org.example.tasks.inno.oop.polimorfizm;

public class Fraction extends Number {
   private final int num, denum;

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("Делитель не может быть нулем.");
        }
        this.num = num;
        this.denum = denum;
    }

    @Override
    public int intValue() {
        return (int) (num / (double) denum);
    }
    @Override
    public long longValue() {
        return (long) (num / (double) denum);
    }
    @Override
    public double doubleValue() {
        return (double) num / denum;
    }
    @Override
    public float floatValue() {
        return (float) num / denum;
    }

 @Override
    public String toString() {
        return num + "/" + denum;
    }
}
