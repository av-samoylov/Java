package org.example.tasks.inno.cycles;

public class RightTriangle {
    public static void main(String[] args) {
        rightTriangle(4);
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 for (int i = 1; i <= x; i++) {
        // Вывод пробелов
        for (int j = 0; j < x - i; j++) {
            System.out.print(" ");
        }
        // Вывод звездочек
        for (int k = 0; k < i; k++) {
            System.out.print("*");
        }
        // Переход на новую строку
        System.out.println();
    }

 */
/*
 for (int i = 1; i <= x; i++) {
        for (int j = x; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
 */