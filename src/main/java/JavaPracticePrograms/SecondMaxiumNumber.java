package JavaPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxiumNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the size ");
        int n= sc.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(secondmaximumnumeb(array));

    }

    private static int secondmaximumnumeb(int[] array) {
        if (array.length < 2)
            return -1;
        Arrays.sort(array);
        int second_max=Integer.MIN_VALUE;
        for (int i = array.length-2;i>=0;i--)
        {
            if(array[i]>second_max)
            {
                return array[i];
            }
        }
            return -1;
    }

}
