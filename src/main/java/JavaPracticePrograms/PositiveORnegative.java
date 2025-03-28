package JavaPracticePrograms;

import java.util.Scanner;

public class PositiveORnegative {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number based on your wish");
        int num= sc.nextInt();
        if(num>0)
        {
            System.out.println("Yes it's postive number");
        }
        else
        {
            if(num<0)
            {
                System.out.println("its negative number");
            }
            else
            {
                System.out.println("");
            }
        }

    }
    Scanner sc=new Scanner(System.in);
}
