package Week4.Day10_string;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println(str);
        input.close();

        System.out.println("--------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s3 == s4);

        String str1 = new String("Java");

        System.out.println((str1 == s2));

        String t1 = "Pyton";
        String t2 = new String("Pyton");
    }
}
