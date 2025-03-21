package JavaPracticePrograms;

import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array ");
        int N =sc.nextInt();
        int array[] =new int[N];
        for (int i = 0; i <array.length ; i++) {
            array[i]= sc.nextInt();
        }

        for(int a :array)
            System.out.println(a);
        System.out.println("enter the target number based on your wish");
        int target =sc.nextInt();
        lienarsearch(array,target);

    }

    private static void lienarsearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("yes the target is found at the index "+i+"and the value is "+array[i]);
            }

        }
    }


}
