package JavaPracticePrograms;

import java.util.Scanner;

public class ArraySumOfElements {

    public static void main(String[] args) {
        Scanner objref=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N=objref.nextInt();
        int array[]=new int[N];
        for (int i = 0; i <array.length ; i++) {
            array[i]=objref.nextInt();

        }

        for(int f:array)
        {
            System.out.println(f);
        }


       System.out.println("the sum of elements in the array "+sumofelements(array));
    }

    private static int sumofelements(int[] array) {

      int sum=0;
        for (int i = 0; i < array.length; i++) {

            sum =sum+array[i];
            
        }
    return sum;
    }
}
