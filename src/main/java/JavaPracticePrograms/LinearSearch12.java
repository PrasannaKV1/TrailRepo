package JavaPracticePrograms;

import java.util.Scanner;

public class LinearSearch12 {
    public static void main(String[] args) {
        int array[] ={23,45,60,77,88,99};
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key to be searched ");
        int key= sc.nextInt();
        for (int i = 0; i < array.length ; i++) {

            if(key==array[i])
            {
                System.out.println("key is found "+key+" found at index "+i);
                flag=true;
                break;
            }

        }
        if(flag==false)
        {
            System.out.println("The key is not found");
        }


    }
}
