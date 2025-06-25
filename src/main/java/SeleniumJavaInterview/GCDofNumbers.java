package SeleniumJavaInterview;

import java.util.Scanner;

public class GCDofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number based on your wish");
        int a= sc.nextInt();
        System.out.println("enter the second number based on your wish");
        int b=sc.nextInt();
        int min=0;
        if(a>b)
        {
            min=b;
        }
        else
        {
            min=a;
        }
        int GCD=0;
        for (int i = 1; i <=min ; i++) {
            if(a%i==0 && b%i==0)
            {
                GCD=i;
            }

        }
        System.out.println(GCD);


    }


}
