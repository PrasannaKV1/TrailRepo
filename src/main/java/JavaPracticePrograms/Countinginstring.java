package JavaPracticePrograms;

import java.util.Scanner;

public class Countinginstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string based on your wish");
        String word =sc.nextLine();
        char[] ch=word.toCharArray();
        int vowelscount=0;
        int constcount=0;
        for (int i = 0; i < ch.length ; i++) {
            if(ch[i]=='A' || ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                vowelscount++;
            }
            else {
                constcount++;
            }

        }

        System.out.println("the total number of vowels count "+vowelscount);
        System.out.println("the total number of consants count"+constcount);

    }
}
