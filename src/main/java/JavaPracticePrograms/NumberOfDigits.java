package JavaPracticePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> digitcount =new ArrayList<>();
        while(N!=0)
        {
            int digit =N%10;
            digitcount.add(digit);
            N=N/10;

        }
        for (int a:digitcount)
        {
            System.out.println(a);
        }
    }
}
