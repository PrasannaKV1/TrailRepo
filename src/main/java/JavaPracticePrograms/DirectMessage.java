package JavaPracticePrograms;

import java.util.Scanner;

public class DirectMessage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number based on your wish");
        int N= sc.nextInt();
        for (int i = 0; i <=N; i++) {
            if(i==4|| i==7||i==8)
            {
                continue;
            }
            System.out.println(i);

            
        }
    }
}
