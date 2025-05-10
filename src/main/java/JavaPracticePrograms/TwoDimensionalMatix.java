package JavaPracticePrograms;

import java.util.Scanner;

public class TwoDimensionalMatix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size of the array ");
        int M = sc.nextInt();
        System.out.println("enter the column size of the array");
        int N = sc.nextInt();
        int array[][]=new int[M][N];
        for (int i = 0; i <M; i++) {
            for (int j = 0; j <N ; j++) {
                array[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i <M ; i++) {
            {
                for (int j = 0; j <N ; j++) {
                    System.out.print(array[i][j]);
                }
            }

        }


    }
}
