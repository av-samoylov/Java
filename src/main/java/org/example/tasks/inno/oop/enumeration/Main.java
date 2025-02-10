package org.example.tasks.inno.oop.enumeration;


import org.example.tasks.inno.cycles.EqualNum;

public class Main {
    public static void main(String[] args) {
        // Пример использования перечисления для выполнения операций
        System.out.println(Operation.ADD.perform(1, 2)); // Сложение
        System.out.println(Operation.SUBTRACT.perform(1, 2)); // Вычитание
        System.out.println(Operation.MULTIPLY.perform(1, 2)); // Умножение
        System.out.println(Operation.DIVIDE.perform(1, 2)); // Деление
    }

    enum Operation {
        ADD {
            @Override
            int perform(int x, int y) {
                return x + y;
            }
        },
        SUBTRACT {
            @Override
            int perform(int x, int y) {
                return x - y;
            }
        },
        MULTIPLY {
            @Override
            int perform(int x, int y) {
                return x * y;
            }
        },
        DIVIDE {
            @Override
            int perform(int x, int y) {
                if (y == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return x / y;
            }
        };

        abstract int perform(int x, int y);
    }
}
