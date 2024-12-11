package org.example.tasks.inno.matods;

public class Max3 {
    public static void main(String[] args) {
        System.out.println(max3(5, 7, 2));
        System.out.println(max3(8, -1, 4));
        System.out.println(max3(4, 4, 10));
        System.out.println(max3(7, 5, 10));
        System.out.println(max3(-10, -1, -5));
    }

    public static int max3(int x, int y, int z) {
        if (x > y && x > z) return x;
        if ( y > z) return y;
        return z;
    }
}

