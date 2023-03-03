package Week2.Day06_if_statements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 20;

        boolean isEven = number % 2 == 0;

        System.out.println("isEven = " + isEven);

        boolean isOdd = number % 2 != 0;

        System.out.println("isOdd = " + isOdd);

        boolean isOdd1 = !isEven;

        System.out.println(isOdd1);

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);
    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

 */