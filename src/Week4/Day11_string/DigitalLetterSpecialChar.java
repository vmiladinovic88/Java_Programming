package Week4.Day11_string;

import java.util.Scanner;

public class DigitalLetterSpecialChar {
    public static void main(String[] args) {

        System.out.println("Enter your string");
        String str = new Scanner(System.in).nextLine();

        if(str.length()>=1) {
            char f = str.charAt(0);
            if (f >= 48 && f <= 57) {
                System.out.println("First character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("First character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("First character is lowercase letter");
            } else {
                System.out.println("First character is special character");
            }
        }else{
            System.out.println("String is empty");
        }


    }
}
