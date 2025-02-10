package org.example.tasks.inno.oop.name;

public class Name {    // 4.1
    public static void main(String[] args) {
//        System.out.println(new Name("Иван", "Петров"));
//        System.out.println(new Name("Вася"));
        Name name1 = new Name("Иван", "Петров");
        Name name2 = new Name("Вася");
        System.out.println(name1);
        System.out.println(name2);
    }

    String name, soname;


    public Name(String name, String soname) {
        this.name = name;
        this.soname = soname;
    }

    public Name(String name) {
        this.name = name;
    }

    public String toString() {
        String res = "";
        if (name != null) {
            res += name + " ";
        }
        if (soname != null) {
            res += soname;
        }
        return res;
    }
}

