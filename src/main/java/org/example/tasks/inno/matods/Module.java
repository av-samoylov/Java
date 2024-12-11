package org.example.tasks.inno.matods;

public class Module {
    public static void main(String[] args) {
        System.out.println(abs(-3));
    }
    public static int abs(int x) {
        if (x > 0) {
            return x;
        } else {
            int y = -x;
            return y;
        }
    }
}
