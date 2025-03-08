package JavaPracticePrograms;

import java.util.Scanner;

public class CheckArmstrongNumberOrNot {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int N =sc.nextInt();
        int original=N;
        int dup=0;
        while(N!=0)
        {
            int digit=N%10;
            dup+=digit*digit*digit;
            N=N/10;
        }
        System.out.println(dup);
        if(dup==original)
        {
            System.out.println("Both are Equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }

    }
}
