package SeleniumJavaInterview;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number based on your wish ");
        int N= sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            if(i==7 ||i==4||i==9)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
