package SeleniumJavaInterview;

import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the no based on your wish");
        int N=sc.nextInt();
        int odd=0;
        for (int i = 1; i <=N ; i++) {
            if(i%2!=0)
            {
                odd=odd+i;
            }

        }
        System.out.println(odd);

    }



}
