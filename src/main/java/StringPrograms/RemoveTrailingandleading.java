package StringPrograms;

import java.util.Scanner;

public class RemoveTrailingandleading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int N = sc.nextInt();
        int array[] =new int[N];
        for (int i = 0; i <= array.length ; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i <=array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
