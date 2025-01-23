import java.util.Scanner;

public class java45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size =sc.nextInt();
        int array[] =new int[size];
        for (int i = 0; i <array.length ; i++)
        {
            array[i]=sc.nextInt();
        }
        for(int a:array)
        {
            System.out.println(a);
        }


    }
}
