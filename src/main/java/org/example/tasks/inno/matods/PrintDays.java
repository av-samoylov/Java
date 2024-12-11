package org.example.tasks.inno.matods;

public class PrintDays {
    public static void main(String[] args) {
        printDays("четверг");
    }
    public static void printDays(String x){
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье"); break;
            default:
                System.out.println("это не день недели");
        }
    }
    public static void printDays2(String x) {
        switch (x.toLowerCase()) { // Приводим строку к нижнему регистру для учета регистра
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break; // Завершаем выполнение, чтобы не проверять дальше
            default:
                System.out.println("это не день недели");
        }
    }
    /*
    // Тестирование
public static void main(String[] args) {
    printDays("четверг"); // тест с корректным днем
    System.out.println("---");
    printDays("чг"); // тест с некорректным вводом
    System.out.println("---");
    printDays("понедельник"); // тест с первым днем недели
    System.out.println("---");
    printDays("Вторник"); // тест с вводом в разном регистре

     */

}

