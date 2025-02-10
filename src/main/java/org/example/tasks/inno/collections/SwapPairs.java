package org.example.tasks.inno.collections;

import java.util.ArrayList;
import java.util.List;

public class SwapPairs {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i += 2) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(i + 1));
            numbers.set(i + 1, temp);
        }
        System.out.println(numbers);
    }
}
