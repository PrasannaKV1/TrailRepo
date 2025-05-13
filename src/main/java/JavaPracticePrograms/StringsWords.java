package JavaPracticePrograms;

import java.util.Scanner;

public class StringsWords {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string based on your wish  ");
        String s=sc.nextLine();
        String arrray[]=s.trim().split("\\s+");
        System.out.println(arrray.length);
    }
}
