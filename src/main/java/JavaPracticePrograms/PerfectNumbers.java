package JavaPracticePrograms;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number based on your wish");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        for (int i = 1; i <num; i++) {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==temp)
        {
            System.out.println("Yes its perfect number");
        }
        else
        {
            System.out.println("No its not perfect number");
        }

    }
}
