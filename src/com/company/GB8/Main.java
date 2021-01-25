package com.company.GB8;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String [] words = {"Moscow", "Berlin", "Moscow", "Perm", "Perm", "Tula"};
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> hMap = new HashMap<>();
        for (String w : words) {
            hMap.put(w , hMap.getOrDefault(w, 0)+1);
        }
        System.out.println(hMap);


        Phone pHone = new Phone();
        pHone.add("Гусев", "85367865434567");
        pHone.add("Гусев", "435465");
        pHone.add("Голубев", "7654356н7898765");
        pHone.add("Ярцев", "5678987654");
        pHone.add("Максимов", "456787654");

        System.out.println("Телефон: " + pHone.get("Гусев"));
        System.out.println("Телефон: " + pHone.get("Ярцев"));

    }
}
