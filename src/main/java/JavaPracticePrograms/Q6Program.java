package JavaPracticePrograms;

import java.security.Key;
import java.util.Map;
import java.util.Scanner;

public class Q6Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size ");
        int array[] =new int[sc.nextInt()];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = i+1; j < array.length; j++) {

             if(array[i]==array[j])
             {
                 ++count;
                 System.out.println(array[i]+" "+count);
             }
             count=0;
            }

        }


    }
}
