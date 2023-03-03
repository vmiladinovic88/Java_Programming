package Week4.Day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number");

        long num4 = input.nextLong();

        input.close();

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);


    }
}
