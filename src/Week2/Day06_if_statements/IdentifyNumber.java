package Week2.Day06_if_statements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        System.out.println(number + " is positive number: " + positive);
        System.out.println(number + " is negative number: " + negative);
       // System.out.println(number + " is zero: " + zero);

        boolean isZero = !positive && !negative;

        System.out.println(number + " is zero: " + isZero);


    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */