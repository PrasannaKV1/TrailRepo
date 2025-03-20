package JavaPracticePrograms;

import java.util.Scanner;

public class PrimeNumbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start range : ");
        int start = sc.nextInt();
        System.out.println("enter the end range ");
        int end = sc.nextInt();

        int noofprimenumers = 0;
        for (int i = start; i <= end; i++) {
            if (isprime(i)) {
                noofprimenumers++;
            }

        }
        System.out.println("the number of prime numbers are :"+noofprimenumers);

    }


    private static boolean isprime(int i) {
        int count=0;
        for (int j =2; j<=i; j++) {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            return false;
        }

        return true;
    }
}

