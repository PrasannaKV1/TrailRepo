package JavaPracticePrograms;

import java.util.Scanner;

public class ArrayRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int a : array) {
            System.out.println(a);
        }

        for (int j = array.length-1; j >= 1; j--) {
            array[array.length - 1] = array[0];
            array[j - 1] = array[j];
        }
            for (int b : array) {
                System.out.println(b);
            }
        }
    }
    
    
