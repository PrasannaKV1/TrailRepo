package JavaPracticePrograms;

import java.util.Scanner;

public class smallestofallnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of the number");
        int N= sc.nextInt();
        int array[]=new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }

        for(int a :array)
        {

            System.out.println(a);
        }


        int small=Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]<small)
            {
                small=array[i];
            }

        }
        System.out.println(small);


    }
}
