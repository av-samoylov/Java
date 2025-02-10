package org.example.tasks.inno.oop.enumeration;

public class Sauce {
    public enum Spiciness{
        VERY_SPICY("очень острый"),
        SPICY("острый"),
        MILD("слабый");
        private final String description;

        Spiciness(String description) {
            this.description = description;
        }
        @Override
        public String toString() {
            return description;
        }
    }

    private String name;
    private Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }

    public String getName() {
        return name;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }
}


/*
  public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Табаско", Sauce.Spiciness.VERY_SPICY);
        Sauce sauce2 = new Sauce("Сальса", Sauce.Spiciness.SPICY);
        Sauce sauce3 = new Sauce("Кетчуп", Sauce.Spiciness.MILD);

        // Вывод информации о соусах
        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
 */