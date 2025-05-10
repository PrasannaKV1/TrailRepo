package JavaPracticePrograms;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i >=0 ; i--) {
            {
                for (int j = N; j >=i ; j--) {
                    System.out.print(" * ");

                }
                System.out.println();
            }


        }

    }
}
