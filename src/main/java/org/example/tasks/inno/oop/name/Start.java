package org.example.tasks.inno.oop.name;

public class Start {             // 4.2 Задать фамилию. Если она не задана, то задать "Иванов".
    public static void main(String[] args) {
        Name name = new Name("Вася");
        changeName(name);
        System.out.println(name);
    }

    public static void changeName(Name name) {
        if (name.soname == null) {
            name.soname = "Иванов";
        }
    }
}
