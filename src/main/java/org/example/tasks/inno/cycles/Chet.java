package org.example.tasks.inno.cycles;

public class Chet {
    public static void main(String[] args) {
        System.out.println(chet(11));
    }

    //    public static String chet(int x) {
//        for (int i = 0; i <= x; i += 2) {
//            System.out.print(i + " ");
//        }
//        return "";
//    }
    public static String chet(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i += 2) {
            result.append(i+" ");
        }
        return result.toString();
    }
}

/*
 public static String chet(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i += 2) {
            result.append(i+" ");
//            if (i <= x) {
//                result.append(" ");
//            }
        }
        return result.toString();
 */
