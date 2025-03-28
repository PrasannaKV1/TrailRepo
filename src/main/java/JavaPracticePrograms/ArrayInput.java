package JavaPracticePrograms;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int size=s.nextInt();
        int array[] =new int[size];
        System.out.println("Please enter the arrays: ");
        for(int i=0;i< array.length;i++)
        {
            array[i]=s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"]"+ "-->"+array[i]);

        }



    }
}
