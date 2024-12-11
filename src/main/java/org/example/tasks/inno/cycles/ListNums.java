package org.example.tasks.inno.cycles;

public class ListNums {
    public static void main(String[] args) {
        System.out.println(listNums(10));
    }

//    public static String listNums(int x) {
//        for (int i = 0; i <= x; i++) {
//            System.out.print(i + " ");
//        }
//        return " ";
//    }

    public static String listNums(int x) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

