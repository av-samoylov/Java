package org.example.tasks.inno.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static String getStringFromStream (Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    public static void printList(ArrayList<Integer> list){
        list.forEach(item -> System.out.println(item));
    }
}
