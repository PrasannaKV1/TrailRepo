package JavaPracticePrograms;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Pattern ");
        int N= sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
