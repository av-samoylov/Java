package org.example.tasks.inno.cycles;

public class NumLen {
    public static void main(String[] args) {
        System.out.println(numLen(12567));
    }

    public static int numLen(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
