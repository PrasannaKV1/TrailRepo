package JavaPracticePrograms;

import java.util.Scanner;

public class IntegerReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number based on your wish");
        int N = sc.nextInt();
        int rev=0;
        while(N!=0)
        {
            int digit=N%10;
            rev=rev*10+digit;
            N=N/10;

        }
        System.out.println(rev);

    }
}
