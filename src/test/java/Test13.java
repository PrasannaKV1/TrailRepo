import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the Size of the arrry");
        int size=sc.nextInt();
        int array[] =new int[size];
        for (int i = 0; i <array.length ; i++) {
                array[i]= sc.nextInt();
        }
        System.out.println(" The array elements are ");
        for(int a:array)
        {
            System.out.println(a);
        }
        for (int k = 0; k <array.length; k++) {


        }

    }
}
