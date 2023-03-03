package Week2.Day06_if_statements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean divisibleby2 = number % 2 == 0;
        boolean divisibleby3 = number % 3 == 0;
        boolean divisibleby5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisibleby2);
        System.out.println(number + " is divisible by 3: " + divisibleby3);
        System.out.println(number + " is divisible by 5: " + divisibleby5);



    }
}
/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero



Single If Statement: can be used for crreating condition for one possible output



 */