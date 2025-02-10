package org.example.tasks.inno.oop.polimorfizm.points2;

import java.util.Arrays;

public class Point2 {
    private int[] coordinates;
    private String color;
    private String appearanceTime;

    public Point2(Builder builder) {
        this.coordinates = builder.coordinates;
        this.color = builder.color;
        this.appearanceTime = builder.appearanceTime;
    }

    public String getColor() {
        return color;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public String getAppearanceTime() {
        return appearanceTime;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordinates=" + Arrays.toString(coordinates) +
                ", color='" + color + '\'' +
                ", appearanceTime='" + appearanceTime + '\'' +
                '}';
    }

    public static class Builder {
        private int[] coordinates;
        private String color;
        private String appearanceTime;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setAppearanceTime(String appearanceTime) {
            this.appearanceTime = appearanceTime;
            return this;
        }

        public Builder setCoordinates(int... coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Point2 build() {
            return new Point2(this);
        }
    }
//    public static void main(String[] args) {
//        // Создание точки с одной координатой и цветом
//        Point2 point1 = new Point2.Builder()
//                .setCoordinates(3)
//                .setColor("красный")
//                .build();
//
//        // Создание точки с тремя координатами и временем появления
//        Point2 point2 = new Point2.Builder()
//                .setCoordinates(4, 2, 5)
//                .setAppearanceTime("11:00")
//                .build();
//
//        // Создание точки с двумя координатами, временем и цветом
//        Point2 point3 = new Point2.Builder()
//                .setCoordinates(7, 7)
//                .setAppearanceTime("15:35")
//                .setColor("желтый")
//                .build();
//
//        // Вывод информации о точках
//        System.out.println(point1);
//        System.out.println(point2);
//        System.out.println(point3);
//    }
}
