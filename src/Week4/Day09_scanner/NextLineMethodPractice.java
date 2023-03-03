package Week4.Day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();


        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your address: ");
        String address = input.nextLine();
    }
}
