package SeleniumJavaInterview;

import java.util.Scanner;

public class NumberMissingInTheArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number based on your wish");
        int N=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=N ; i++) {

            if (i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

}
