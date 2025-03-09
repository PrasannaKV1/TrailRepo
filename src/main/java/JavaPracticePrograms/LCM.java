package JavaPracticePrograms;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the first number");
        int A=sc.nextInt();
        System.out.println("Enter the second number ");
        int B= sc.nextInt();
        int max=0;
        int LCM=0;
        if(A>B)
        {
            max=A;
        }
        else
        {
            max=B;
        }
        for (int i = 1; i <=max ; i++) {
            if(i%A==0&&i%B==0)
            {
                LCM=i;
            }

        }
        System.out.println(LCM);
    }
}

