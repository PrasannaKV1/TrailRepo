package JavaPracticePrograms;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String based on your wish ");
        String s=sc.nextLine();
        String empty="";
        for(int i=s.length()-1;i>=0;i--)
        {
            empty=empty+s.charAt(i);
        }
        if(s.equals(empty))
        {
            System.out.println("yes its palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }
    }
}

