import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("verified in staging");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N= sc.nextInt();
        int array[]=new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();

        }
        // for loop for printing the loop
        int sum=0;
        for(int k = 0; k < array.length; k++)
        {
            if(array[k]%2!=0)
            {
               sum+=array[k];
            }
        }



    }
}
