package SeleniumJavaInterview;

import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plese enter the first number based on your wish");
        int a = sc.nextInt();//5
        System.out.println("please enter the second number");
        int b= sc.nextInt();//6
        a=a+b;//11
        b=a-b;//5
        a=a-b;//6
        System.out.println("the numbers of after swapping are"+a+ "," +b);
    }
}
