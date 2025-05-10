package JavaPracticePrograms;

import java.util.Scanner;

public class NumberOfDivisor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number based on your wish");
        int N= sc.nextInt();
        int NumberofDivisor=0;
        for (int i = 1; i <=N ; i++) {
            if(N%i==0)
            {
                NumberofDivisor++;
            }
        }
        System.out.println("the number of postive divisors "+NumberofDivisor);

    }
}
