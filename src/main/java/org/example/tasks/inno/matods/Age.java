package org.example.tasks.inno.matods;

public class Age {
    public static void main(String[] args) {
        System.out.println(age(5));
        System.out.println(age(31));
        System.out.println(age(11));
        System.out.println(age(44));
        System.out.println(age(12));
        System.out.println(age(1));
        System.out.println(age(13));
        System.out.println(age(14));
        System.out.println(age(33));
        System.out.println(age(22));
    }
    public static String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) return x + " год";
        if (x % 10 == 2 && x % 100 != 12
                || x % 10 == 3 && x % 100 != 13
                || x % 10 == 4 && x % 100 != 14)
            return x + " года";
        return x + " лет";
    }
}

