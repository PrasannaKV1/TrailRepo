package JavaPracticePrograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int N= sc.nextInt();
        int temp=N;
        int rev=0;
        while(N!=0)
        {
            int digit=N%10;
            rev=rev*10+digit;
            N=N/10;
        }
        if(rev==temp)
        {
            System.out.println("Yes its palindrome ");
        }
        else {
            System.out.println("its not a palindrome");
        }
    }
}
