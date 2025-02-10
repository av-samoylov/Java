package org.example.tasks.inno.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);

        System.out.println("До реверса: " + numbers);
        reverse(numbers);
        System.out.println("После реверса: " + numbers);
    }

}
