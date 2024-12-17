package org.example.tasks.inno.cycles;

public class NumLen {
    public static void main(String[] args) {
        System.out.println(numLen(12567));
    }

    public static int numLen(long x) {
        int count = 0;
        do {
            count++;
            x /= 10;
        } while (x > 0);
        return count;
    }
}
