package JavaPracticePrograms;

import java.util.Scanner;

public class Sumofevenandodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int N = sc.nextInt();
        int sumEven=0,sumodd=0;
        for (int i = 1; i <=N ; i++) {
           if(i%2==0)
           {
               sumEven++;
           }
           else {
               sumodd++;
           }
        }
        System.out.println("the sumofeven number is :"+sumEven+"And the sumofodd number is:"+sumodd);
    }

}
