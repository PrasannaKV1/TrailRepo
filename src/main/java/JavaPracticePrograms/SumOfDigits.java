package JavaPracticePrograms;

import java.util.Scanner

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number based on your wish ");
        int N = sc.nextInt();
        // now im finding the sum of digits in the number
        int sum=0;
        while(N!=0)
        {
            int digit=N%10;//we will get the digit from this line
            sum+=digit;
            N=N/10;
        }

        System.out.println("the sum of the digits are : "+sum);
    }
}
