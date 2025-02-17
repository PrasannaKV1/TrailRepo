package JavaPracticePrograms;

import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the value of n basically ");
        int N =sc.nextInt();
        int array[] =new int[N];
        for (int i = 0; i <N ; i++) {
           array[i]=sc.nextInt();
        }
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]);
        }
        int[] array1=prefixsum(array);
        for (int z:array1)
        {
            System.out.println(z);
        }

    }

     static int[] prefixsum(int[] array)
    {
        int length=array.length;
         int pf[]=new int[length];
        for (int k = 0; k < length; k++) {
            int sum=0;
            for(int m=0;m<=k;m++)
            {
                sum=sum+array[m];
            }
            pf[k]=sum;

        }
     return pf;
    }

}
