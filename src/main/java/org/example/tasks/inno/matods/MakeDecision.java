package org.example.tasks.inno.matods;

public class MakeDecision {
    public static void main(String[] args) {
        System.out.println(makeDecision(5, 7));
        System.out.println(makeDecision(8, -1));
        System.out.println(makeDecision(4, 4));
    }
    public static String makeDecision(int x, int y) {
        if (x < y) return (x + " < " + y);
        if (x > y) return (x + " > " + y);
        return (x + " == " + y);
    }
}

