package JavaPracticePrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number based on your wish");
        int N = sc.nextInt();
        int temp=N;
        int sum=0;
        while(N!=0)
        {
               int digit=N%10;
               sum=sum+(digit*digit*digit);
               N=N/10;
        }

        if(temp==sum)
        {
            System.out.println("Yes,its Armstrong number");
        }
        else
        {
            System.out.println("its not a armstrong number");
        }
    }

}
