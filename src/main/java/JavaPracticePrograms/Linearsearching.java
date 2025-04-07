package JavaPracticePrograms;

import java.util.Scanner;

public class Linearsearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println("please enter the sie of the array ");
        int array[]=new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("enter the number you wanna search");
        int Number= sc.nextInt();
        System.out.println(ispresent(array,Number));


            


    }

    private static boolean ispresent(int[] array, int number) {

        for (int i = 0; i <array.length ; i++) {
            if(array[i]==number)
            {
                return true;
            }

        }


        return false;
    }
}

