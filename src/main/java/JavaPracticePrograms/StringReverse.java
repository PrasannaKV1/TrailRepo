package JavaPracticePrograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter valid string ");
        String s=sc.nextLine();
        String reverse="";
        for (int i = s.length()-1;i>=0 ; i--) {
               reverse=reverse+s.charAt(i);

        }
        System.out.println("The reversed string is"+reverse);



    }

}
