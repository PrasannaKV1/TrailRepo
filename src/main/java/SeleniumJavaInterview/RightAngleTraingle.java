package SeleniumJavaInterview;

import java.util.Scanner;

public class RightAngleTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the side A");
        int a= sc.nextInt();
        System.out.println("Please enter the side B");
        int b= sc.nextInt();
        System.out.println("Please enter the side C");
        int c= sc.nextInt();
        System.out.println(isrightangletraingle(a,b,c));

    }

    private static boolean isrightangletraingle(int a, int b, int c) {
        int array[]={a,b,c};
        return (array[0]*array[0]+array[1]*array[1])==(array[2]*array[2]);
    }
}
