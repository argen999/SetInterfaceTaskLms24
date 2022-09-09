package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println(symmetricDifference(set1, set2) );
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new TreeSet<>(set1);
        set3.addAll(set2);
        Set<Integer> temp = new TreeSet<>(set1);
        temp.retainAll(set2);
        set3.removeAll(temp);
        return set3;
    }
}