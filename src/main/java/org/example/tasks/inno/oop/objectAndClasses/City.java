package org.example.tasks.inno.oop.objectAndClasses;

import java.util.ArrayList;
import java.util.List;

class City {
    private String name;
    private List<Path> paths;

    // Конструктор
    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    // Метод для добавления пути
    public void addPath(City city, double cost) {
        paths.add(new Path(city, cost));
    }

    // Метод для получения текстового представления города
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " -> ");
        for (Path path : paths) {
            sb.append(path.city.name).append(": ").append(path.cost).append(", ");
        }
        return sb.toString();
    }

    // Метод для путешествия по путям
    public City travelBy(int n) {
        City currentCity = this;
        for (int i = 0; i < n; i++) {
            if (currentCity.paths.isEmpty()) {
                return null; // Если нет путей, возвращаем null
            }
            currentCity = currentCity.paths.get(0).city; // Переход к первому городу в списке путей
        }
        return currentCity;
    }

    // Внутренний класс для представления пути
    private static class Path {
        City city;
        double cost;

        Path(City city, double cost) {
            this.city = city;
            this.cost = cost;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Создаем города
//        City A = new City("A");
//        City B = new City("B");
//        City C = new City("C");
//        City D = new City("D");
//        City E = new City("E");
//        City F = new City("F");
//
//        // Настраиваем пути между городами
//        A.addPath(B, 10);
//        A.addPath(C, 15);
//        B.addPath(D, 12);
//        B.addPath(F, 5);
//        C.addPath(E, 10);
//        D.addPath(A, 8); // Чтобы при n=3 вернуться в A
//        F.addPath(A, 20); // Чтобы при n=3 вернуться в A
//
//        // Тестируем метод travelBy
//        System.out.println("Город после 1 перехода из B: " + B.travelBy(1)); // Ожидается A или C
//        System.out.println("Город после 2 переходов из B: " + B.travelBy(2)); // Ожидается B, D или F
//        System.out.println("Город после 3 переходов из B: " + B.travelBy(3)); // Ожидается A
//
//        // Выводим все города и их пути
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//        System.out.println(E);
//        System.out.println(F);
//    }
//}
