package Week2.Day06_if_statements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }

        if(num1 < num2){
            System.out.println(num2 + " is the maximum number");
        }

        if(num1==num2) {
            System.out.println(num1 +" and "+ num2 + " are equal numbers");
        }


    }
}

/*
1. Create a class named MaximumNumber.java
2. Declare the following variables: 1. num1
2. num2
3. Write a program that can print the maximum number between the two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
20 is the maximum number
 */