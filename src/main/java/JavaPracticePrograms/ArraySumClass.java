package JavaPracticePrograms;

import java.util.Scanner;

public class ArraySumClass {


    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N=sc.nextInt();
        int array[] =new int[N];
        for(int k=0;k<array.length;k++)
        {
            array[k]=sc.nextInt();

        }

        for(int g:array)
        {
            System.out.println(g);
        }

        System.out.println("the maximum element of the array is"+findoutmaximumofelement(array));

    }

    private static int findoutmaximumofelement(int[] array) {

        int maximumelement=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>=maximumelement)
            {
                maximumelement=array[i];
            }
        }
        return maximumelement;
    }
}
