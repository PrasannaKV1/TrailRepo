import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N=sc.nextInt();
        int array[] =new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }

    }
}
