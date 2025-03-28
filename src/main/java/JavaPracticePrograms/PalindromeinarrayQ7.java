package JavaPracticePrograms;

import java.util.Scanner;

public class PalindromeinarrayQ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array ");
        int size =sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]=sc.nextInt();
        }
        int count=0;
        int trail[]=new int [size];
        for(int i=0;i< array.length;i++)
        {
            int reverse = 0;
            int temp=array[i];
            while (array[i]!=0)
            {
                int digit=array[i]%10;
                reverse=reverse*10+digit;
                array[i]=array[i]/10;

            }
            if(reverse==temp)
            {
                    trail[i] = temp;
                    count++;


            }


        }

        System.out.println(count);
        for (int m= 0; m<trail.length ; m++) {
            System.out.println(trail[m]);

        }
    }

}
