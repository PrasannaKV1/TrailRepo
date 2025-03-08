package JavaPracticePrograms;

import java.util.Scanner;

public class CountDigitsWhichEvenlyDivides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int N = sc.nextInt();
        int original = N;
        int count=0;
        while(N!=0)
        {

            int digit=N%10;
            if(original%digit==0)
            {
                count++;
            }
            N=N/10;

        }
        System.out.println("The Number of digits "+count);

    }
}

