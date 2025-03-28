package JavaPracticePrograms;

import java.util.Scanner;

public class CodingNinaz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        int N=sc.nextInt();
        int array[]=new int[N+1];
        System.out.println("enter the "+ N +" elements");

        for (int i = 0; i <N; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("length of array before inserting"+"‐‐‐>"+array.length);
        for (int j = 0; j < N ; j++) {
            System.out.println(j+"‐‐‐‐‐‐‐>"+array[j]);

        }
        System.out.println(" enter the index of specified position or index ");
        int index= sc.nextInt();
        System.out.println(" enter the element to replace to specified index ");
        int element= sc.nextInt();
        // now i need to right shift of elements
          //6  6>3
        for(int i=N;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        for (int k = 0; k <array.length ; k++) {
            System.out.println(k+"‐‐‐‐‐‐‐>"+array[k]);
        }








    }
}
