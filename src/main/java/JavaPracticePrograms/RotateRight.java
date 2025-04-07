package JavaPracticePrograms;

import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int array[]=new int[N];
        for (int a = 0; a <array.length ; a++) {
            array[a]= sc.nextInt();

        }
        for(int l:array)
        {
            System.out.println(l);
        }

        int temp =array[array.length-1];
                   //  6   to 1
        for ( int i = array.length-1; i >=1  ; i--) {
            array[i]=array[i-1];
        }
        array[0]=temp;
        System.out.println("this is the ");
        for(int m:array)
        {
            System.out.println(m);
        }
    }
}
