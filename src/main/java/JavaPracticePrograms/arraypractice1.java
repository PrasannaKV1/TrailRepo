package JavaPracticePrograms;

import java.util.Scanner;

public class arraypractice1 {
    public static void main(String[] args) {
        int array[] ={1,4,5,6,7,8,2,3};
        int length= array.length;
        int arraysum =0;
        for(int a:array)
        {
            arraysum+=a;
        }
        int N =length+1;
        int sum=(N*(N+1))/(2);
        int diff=sum-arraysum;
        System.out.println("the msssing number is "+diff);








    }
}
