package org.example.tasks.inno.matods;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumLastNums(4568));
    }

    public static int sumLastNums(int x) {
        int z = x % 10;
        int у = x / 10 % 10;
        return z + у;
    }
}

