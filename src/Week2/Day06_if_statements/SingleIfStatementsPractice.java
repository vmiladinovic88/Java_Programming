package Week2.Day06_if_statements;

public class SingleIfStatementsPractice {

    public static void main(String[] args) {

        int number = 158;

        boolean isEven = number % 2 == 0;

        if(isEven) {
            System.out.println(number + " is even");
        }

        if(number % 2 == 0) {

            System.out.println(number + " is even");
        }

        if(!isEven) {
            System.out.println(number + " is odd");
        }

        if(number % 2 == 0) {

            System.out.println(number + " is even");
        }
    }
}
