package TakeYouForward;

import java.util.Scanner;

public class leftroatate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please,enter the size of the arary");
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]=sc.nextInt();
        }

        int temp =array[0];
        for (int j =1; j < array.length ; j++) {
            array[j-1]=array[j];
        }
        array[array.length-1]=temp;


        for (int k =0; k < array.length; k++) {
            System.out.println(array[k]);

        }

    }
}
