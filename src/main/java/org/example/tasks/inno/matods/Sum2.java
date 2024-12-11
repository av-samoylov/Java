package org.example.tasks.inno.matods;

public class Sum2{
    public static void main(String[] args) {
        System.out.println(sum2(5, 7));
        System.out.println(sum2(8, -1));
        System.out.println(sum2(5, 5));
    }
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }
}

