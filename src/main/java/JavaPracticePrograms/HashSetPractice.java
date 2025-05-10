package JavaPracticePrograms;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice {
    public static void main(String[] args) {
        System.out.println("actual hashset practice ");
        HashSet<Integer> unique=new HashSet<Integer>();
        unique.add(3);
        unique.add(4);
        unique.add(9);
        unique.add(10);
        System.out.println(unique);
        System.out.println(unique.contains((2)));
        System.out.println(unique.contains((3)));


    }
}
