import java.util.Scanner;

public class Test43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int N = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int a : array) {
            System.out.println(a);
        }

        System.out.println(isarrayincreasing(array));

    }

    public static boolean isarrayincreasing(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {
                if (array[k]<array[j]) {
                    return false ;
                }
            }
        }
        return true;

    }


}






        // now check madbeku  strictly increasing /ord decreasing
        
