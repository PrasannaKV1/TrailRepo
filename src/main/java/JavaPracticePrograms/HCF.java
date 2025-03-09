package JavaPracticePrograms;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("kindly enter the first number");
        int A =sc.nextInt();
        System.out.println("Kindly enter the second number");
        int B =sc.nextInt();
        int min=0;
        int HCF=0;
        if(A<B)
        {
            min=A;
        }
        else {
            min=B;
        }
        for (int i = 1; i <=min ; i++) {
            if(A%i==0&&B%i==0)
            {
                HCF=i;
            }

        }
        System.out.println("The HCF of two numbers are "+HCF);

    }
}
