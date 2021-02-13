package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordsList {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add("bear");
        animals.add("fox");
        animals.add("wolf");
        animals.add("lion");
        animals.add("tiger");
        animals.add("wolf");
        animals.add("bear");
        animals.add("hare");
        animals.add("cat");
        animals.add("wolf");
        animals.add("dog");
        animals.add("pig");
        animals.add("rabbit");
        animals.add("rabbit");
        animals.add("chicken");
        animals.add("panda");
        animals.add("panda");
        animals.add("koala");
        animals.add("panda");
        animals.add("panda");

        System.out.println("Total list animals: " + animals);
        System.out.println("---------------------");
        System.out.println("---------------------");


        Set<String> stringSet = new LinkedHashSet<>(animals);
        System.out.println("Unique animals: " + stringSet);
        System.out.println("---------------------");
        System.out.println("---------------------");

        HashMap<String, Integer> doubleNames = new HashMap<>();
        Integer doubleName = null;
        for (String i : animals) {
            doubleName = doubleNames.get(i);
            doubleNames.put(i, doubleName == null ? 1 : doubleName + 1);
        }

        System.out.println("Word count in my list: " + doubleNames);
    }
}
