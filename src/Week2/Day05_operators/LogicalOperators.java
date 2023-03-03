package Week2.Day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 90000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >=18;

        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("----------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >=18 && country == "USA";

        System.out.println("eligibleToVote = " + eligibleToVote);

        System.out.println("----------------------");

        String answer = "yes";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println("validAnswer = " + validAnswer);

        char grade = 'A';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade =='D';

        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println("----------------------");

        System.out.println(!true);

        String a = "yes";

        boolean yes = a == "yes";
        boolean no = !yes;

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("----------------------");

        int score = 65;

        boolean passedTheExam1 = score >=60;
        boolean failed = !passedTheExam1;

        System.out.println("failed = " + failed);
        System.out.println("passedTheExam1 = " + passedTheExam1);

        System.out.println("----------------------");

        System.out.println(  true == !false  && false != true && true != !true );




    }
}
