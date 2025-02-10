package org.example.tasks.inno.collections.generic;

import java.util.ArrayList;

public class Box <T>{
    private ArrayList<T> arrayList = new ArrayList<>(); // ArrayList<String>
    public void add(T s) {
        arrayList.add(s);
    }
}
