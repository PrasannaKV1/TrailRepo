package JavaPracticePrograms;

import java.util.Scanner;

public class SumofAlldivisors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int sum=0;
        for (int i =2; i <=N ; i++) {
            if(N%i==0)
            {
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
