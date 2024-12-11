package org.example.tasks.inno.cycles;

public class EqualNum {
    public static void main(String[] args) {
        System.out.println(equalNum(-1111111));
    }

    public static boolean equalNum(int x) {
        if (x < 0) return false;
        int lastDigit = x % 10;

        while (x > 0) {
            if (x % 10 != lastDigit) return false;
            x /= 10;
        }
        return true;
    }
}
