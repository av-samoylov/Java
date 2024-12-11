package org.example.tasks.inno.matods;

public class IsUpperCase {
    public static void main(String[] args) {
        System.out.println(isUpperCase('D'));
        System.out.println(isUpperCase('j'));
        System.out.println(isUpperCase('U'));
        System.out.println(isUpperCase('v'));
    }
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }
}

