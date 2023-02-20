package Odevler;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(4, "four");
        map.put(5, "five");
        map.put(3, "three");
        map.put(2, "two");
        map.put(6, "six");
        map.put(7, "seven");
        for (Integer val : map.keySet())
            System.out.println(map.get(val));
    }
}






