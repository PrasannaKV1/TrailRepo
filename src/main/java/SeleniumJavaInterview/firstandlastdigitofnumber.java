package SeleniumJavaInterview;

import java.util.Scanner;

public class firstandlastdigitofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number based on your wish ");
        int N = sc.nextInt();
        int lastdigit=N%10;
        int firstdigit=N;
        while(firstdigit>=10)
        {
            firstdigit/=10;
        }
        System.out.println("the first and last digit of the number are "+firstdigit+ ","+lastdigit);

    }
}
