package TakeYouForward;

import java.util.Scanner;

public class arraysinc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter the size of the array ");
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]=sc.nextInt();

        }
        System.out.println(isincreasing(array));


    }

    public static boolean isincreasing(int array[])
    {
        for(int i=1;i< array.length;i++)
        {
            if(array[i]<array[i-1])
            {
                return false;
            }
        }
        return true;
    }


}
