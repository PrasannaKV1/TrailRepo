package SeleniumJavaInterview;

import java.util.Scanner;

public class sumofalldigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number based on your wish");
        int N = sc.nextInt();
        int sum=0;
        while(N!=0)
        {
            int digit=N%10;
            sum+=digit;
            N=N/10;
        }
        System.out.println("The sum of the digits are " +sum);
    }
}
