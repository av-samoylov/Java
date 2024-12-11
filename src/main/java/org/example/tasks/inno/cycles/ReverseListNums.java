package org.example.tasks.inno.cycles;

public class ReverseListNums {
    public static void main(String[] args) {
        System.out.println(reverseListNums(10));
    }
//    public static String reverseListNums(int x) {
//        for (int i = x; i >= 0; i--) {
//            System.out.print(i + " ");
//        }
//        return "";
//    }
    public static String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
