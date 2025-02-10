package org.example.tasks.inno.collections.generic;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Box<String> box = new Box<>();
        box.add("a");
        box.add("b");
        box.add("c");
    }
}
