package JavaPracticePrograms;

import java.util.Scanner;

public class NumberofVowelscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String based on your wish");
        String s =sc.nextLine();
        String line =s.toLowerCase();
        int count=0;
        for (char ch:line.toCharArray()) {

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;

            }
        }
        System.out.println("The number of vowels are " +count);



    }
}
