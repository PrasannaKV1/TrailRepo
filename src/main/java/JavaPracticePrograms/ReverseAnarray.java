package JavaPracticePrograms;

import java.util.Scanner;

public class ReverseAnarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int N= sc.nextInt();
        int array[] =new int [N];
        System.out.println("enter the "+ N +" elements: ");
        for (int k = 0; k < array.length ; k++) {
            array[k]= sc.nextInt();

        }
        System.out.println("Original Array:");
        for (int i = 0; i <N ; i++) {
            System.out.println(i+"-->"+array[i]);
        }
        for (int m = 0; m < array.length ; m++)
            {
                for (int n=m+1; n <array.length ; n++) {
                   {
//                       if(array[m]>=array[n]) {
                            int temp = array[m];
                            array[m] = array[n];
                            array[n] = temp;
//                       }
                   }


                }
            }
        System.out.println("Reversed Array:");
        for (int l = 0; l < array.length ; l++) {
            System.out.println(l+"-->"+array[l]);

        }




        }


    }

