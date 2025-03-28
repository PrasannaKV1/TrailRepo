package JavaPracticePrograms;

import java.util.Scanner;

public class BigandSmall {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int N= sc.nextInt();
        int array[]=new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<min)
            {
                min=array[i];
            }


        }
        for (int j = 0; j < array.length ; j++) {
            if(array[j]>max)
            {
                max=array[j];
            }

        }
        System.out.println("min value of the array "+min);
        System.out.println("max value of the array"+max);
    }
}
