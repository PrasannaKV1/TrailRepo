package JavaPracticePrograms;

import java.util.Scanner;

public class factorialofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the new number");
        int N=sc.nextInt();
        int result=1;
        for(int i=1;i<=N;i++)
        {
            result=result*i;
        }
        System.out.println("the fatorial of the number "+result);
    }
}
