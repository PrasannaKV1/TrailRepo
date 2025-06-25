package JavaPracticePrograms.prime1;

import java.util.Scanner;

public class js {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value of N ");
        int num=sc.nextInt();
        boolean result=isPrime(num);
        System.out.println(result);

        }

    static boolean isPrime(int num) {
    int count =0;
    for(int i=2;i<=num;i++) {

        if(num%i==0) {
            count++;
        }
    }
    return count>=2?false:true;

    }
}

