package com.andersenlab;

import java.util.*;

public class StringArray {

    public static void getUnicsValues(String[] stringArray) {
        Set<String> unique = new HashSet<>();
        for (String str : stringArray) {
            unique.add(str.toLowerCase(Locale.ROOT));
        }
        for (String str : unique) {
            System.out.println(str);
        }
    }

    public static void countDuplicates(String[] stringArray) {
        Map<String, Integer> words = new HashMap<>();
        for (String str : stringArray) {
            words.put(str.toLowerCase(Locale.ROOT), words.get(str.toLowerCase(Locale.ROOT)) == null ? 1 :
                    (words.get(str.toLowerCase(Locale.ROOT)) + 1));
        }
        System.out.println(words);
    }
}

