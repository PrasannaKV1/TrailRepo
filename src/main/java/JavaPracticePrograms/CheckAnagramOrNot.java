package JavaPracticePrograms;

import java.util.Scanner;

public class CheckAnagramOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter the first string based on your wish");
        String s1= sc.nextLine();
        System.out.println("enter the second string based on your wish");
        String s2=sc.nextLine();
        int length1=s1.length();
        int length2=s2.length();
       int count =0;
         for (int i = 0; i <=s1.length(); i++) {
            char c=s1.charAt(i);
            //int count=0;
            for (int j = 0; j <s2.length(); j++) {
                if(c==s2.charAt(j))
                {
                    count++;
                }

            }

        }

    }
}
