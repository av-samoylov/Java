package org.example.tasks.inno.cycles;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }

    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
