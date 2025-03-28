package JavaPracticePrograms;

import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N= sc.nextInt();
        int array[]=new int[N];
        for (int i = 0; i < array.length ; i++) {

            array[i]= sc.nextInt();
        }
        // 0,1,2,3,4,5 --> 6
        //{1,2,3,4,5,6};
        System.out.println("enter the index where you wanna delete the ");
        int index = sc.nextInt();
        //3  to 6
           // 3
        for (int i = index; i < array.length; i++) {
            array[i]=array[i+1];

        }

        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }



    }
}
