package Week2.Day06_if_statements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 1;
        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9|| number == 13;
        boolean has31Days = !has28Days && !has30Days;

        String result = "";

        if(has28Days){
            result = "28 days";
        }
        if(has30Days){
            result = "30 days";
        }
        if(has31Days){
            result = "31 days";
        }

        System.out.println(result);
    }
}
