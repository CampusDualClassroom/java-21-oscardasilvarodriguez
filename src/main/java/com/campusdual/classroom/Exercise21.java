package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> customSet = new HashSet<>();
        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");
        return customSet;

    }

    public static Set<String> createTreeSet() {
        Set<String> customSet = new TreeSet<>();
        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");
        return customSet;

    }

    private static void printSet(Set<String> customSet) {
        for (String s: customSet) {
            System.out.println(s);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        boolean hashSetAdd = addElementToSet(hashSet, "ELEMENT AAA\n");
        System.out.println("Elemento añadido correctamente: " + (hashSetAdd ? "correcto" : "incorrecto"));
        boolean treeSetAdd = addElementToSet(treeSet, "ELEMENT AAA\n");
        System.out.println("Elemento añadido correctamente: " + (treeSetAdd ? "correcto" : "incorrecto"));

        System.out.println("\nElementos en HashSet: \n");
        printSet(hashSet);
        System.out.println("\nElementos en TreeSet: \n");
        printSet(treeSet);
    }

}
