package org.example.tasks.inno.reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
public class Cat {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private List friendsName = new ArrayList<>();

    public Cat(String name, int age, List friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    public static void resetObject(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (!field.getType().isPrimitive()) {
                    field.set(obj, null);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        // Обнулить все поля
        Cat.resetObject(cat);
        System.out.println(cat);
    }
}
*/


public class Cat {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private List friendsName = new ArrayList<>();

    public Cat(String name, int age, List friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }


    public static void nullifyObject(Object obj) {
        if (obj == null) {
            return;
        }
        Class<?> clazz = obj.getClass();
        // Обходим все классы в иерархии (на случай, если есть наследники)
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                // Пропускаем статические поля
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                // Обнуляем только ссылочные (непримитивные) поля
                if (!field.getType().isPrimitive()) {
                    field.setAccessible(true);
                    try {
                        field.set(obj, null);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Не удалось обнулить поле " + field.getName(), e);
                    }
                }
            }
            clazz = clazz.getSuperclass();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("Before nullification: " + cat);
        // Обнуляем все ссылочные поля объекта cat
        nullifyObject(cat);
        System.out.println("After nullification: " + cat);
    }
}

