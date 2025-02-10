package org.example.tasks.inno.oop.encapsulationClassRelations;

public class Fraction2 {
    private int num;
    private int denum;

    public Fraction2(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("Делитель не может быть нулем");
        }
        this.num = num;
        this.denum = denum;
    }
    @Override
    public String toString() {
        return num + "/" + denum;
    }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Fraction2 fraction = (Fraction2) obj;
            Fraction2 other = (Fraction2) obj;
            return num == other.num && denum == other.denum;
        }
        @Override
        public int hashCode() {
            return 31 * num+ denum;
        }
        @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Fraction2(this.num, this.denum);
    }
    public static void main(String[] args) {
      Fraction2 f1 = new Fraction2(1, 3);
      Fraction2 f2 = new Fraction2(2, 5);
      Fraction2 f3 = new Fraction2(7, 8);
      System.out.println("f1.equals(f2" + f1.equals(f2));
      System.out.println("f1.equals(f3" + f1.equals(f3));

    }

}




