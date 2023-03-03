package Week4.Day11_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String correctUsername = "Cydeo",
                correctPassword = "WoodenSpoon";

        System.out.println("Enter your username");

        String username = input.nextLine();

        System.out.println("Enter your password");

        String password = input.nextLine();

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }


    }
}
