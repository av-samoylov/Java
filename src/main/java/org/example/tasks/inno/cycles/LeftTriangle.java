package org.example.tasks.inno.cycles;

public class LeftTriangle {
    public static void main(String[] args) {
        leftTriangle(2);
    }

    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
