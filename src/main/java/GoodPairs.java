import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of the array :");
        int array[]=new int[sc.nextInt()];
        for(int i=1;i< array.length;i++)
        {
            array[i]= sc.nextInt();
        }

        for (int l:array) {
            System.out.println(l);
        }
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]==array[j])
                {
                    count++;
                }

            }

        }
        System.out.println("The number of good pairs are "+count);

    }
}
