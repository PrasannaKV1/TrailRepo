package JavaPracticePrograms;

import java.util.Scanner;

public class DifferencebwMaxium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N = sc.nextInt();
        int array[] =new int[N];
        int maxeven=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }

        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0)
            {
                if(array[i]>=maxeven)
                {
                    maxeven=array[i];
                }
            }

        }

        System.out.println(maxeven);
        int minodd=Integer.MAX_VALUE;


        for (int j = 0; j < array.length ; j++) {

            if(array[j]%2!=0)
            {
                if(array[j]<=minodd)
                {
                    minodd=array[j];
                }
            }
        }
        System.out.println(minodd);
        int diff=maxeven-minodd;
        System.out.println(diff);

    }

}
