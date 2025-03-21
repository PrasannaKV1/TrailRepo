package JavaPracticePrograms;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size =sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("Total number of even numbers "+noevennumbes(array));
        


    }

    private static int noevennumbes(int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0)
            {
                count++;
            }

        }
        return count;
    }
}
