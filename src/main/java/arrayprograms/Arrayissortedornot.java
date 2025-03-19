package arrayprograms;

import java.util.Scanner;

public class Arrayissortedornot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int N = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println(isSorted(array));
    }


    public static boolean isSorted(int[] array) {
     //            0  to 4-1=3
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
