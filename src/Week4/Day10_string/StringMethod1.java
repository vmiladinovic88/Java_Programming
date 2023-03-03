package Week4.Day10_string;

import java.util.Scanner;

public class StringMethod1 {
    public static void main(String[] args) {
        String str = "Cydeo";
        //index =     01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("-------------------");
        
        String sentence = "Java programming language";
        
        int length = sentence.length();
        System.out.println("length = " + length);

        int lastIndex = length - 1;
        System.out.println("last index = " + lastIndex);

        String s1 = "Wooden spoon";

        char first = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char l = s1.charAt(lastIndexNum);
        System.out.println(first + " : " + l);

        System.out.println("-------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println("----------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2);
        System.out.println(r1 == r3);
        System.out.println(r2 == r3);

        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));

        System.out.println("-----------");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if (age >=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

    }
}
