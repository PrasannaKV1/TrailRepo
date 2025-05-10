package JavaPracticePrograms;

import java.util.Scanner;

public class RightShiftOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = sc.nextInt();
        int array[] =new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
 //  int array.length is 5

        // 4th element na temprory alli  story madata idiaya
        System.out.println("Enter the number of times you wanna rotate ");
        int rotation=sc.nextInt();


        for (int i = 0; i <rotation ; i++) {
            int temp =array[array.length-1];
            // 3
            for(int j= array.length-2;j>=0;j--)
            {
                array[j+1]=array[j];
            }
            array[0]=temp;

        }


        for(int a:array)
        {
            System.out.println(a);
        }




    }
}
