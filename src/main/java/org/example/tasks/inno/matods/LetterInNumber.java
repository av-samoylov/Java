package org.example.tasks.inno.matods;

public class LetterInNumber {
    public static void main(String[] args) {
        System.out.println(charToNum('5'));
    }
    public static int charToNum(char x) {
        int y =(int) x - 48;
        return y;
    }
}

