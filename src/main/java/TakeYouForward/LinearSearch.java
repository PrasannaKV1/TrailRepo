package TakeYouForward;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the target element you wanna search ");
        int target=sc.nextInt();
        linearsearch(array,target);


    }

    public static void linearsearch(int array[],int target)
    {
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==target)
            {
                System.out.println("The Target is found at the index "+ i +" and the value is "+ array[i]);
            }

        }


    }
}
