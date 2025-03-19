package JavaPracticePrograms;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int N = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }
        }
        for (int a : array) {
            System.out.println(a);
        }


        System.out.println(maximumelement(array));

    }



   private static int maximumelement(int[] array) {
        int max=Integer.MIN_VALUE;
        int secondmax=max;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>=max)
            {
                max=array[i];
            }
        }
        for (int j=array.length-1;j>=0;j--) {
            if(array[j]<max && array[j]<Integer.MIN_VALUE)
            {
                secondmax=array[j];
            }


        }
        return secondmax;

    }
}
