package Week3.Day08_ternaries_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int number = 100;
        /*
        String result = "";

        if (number > 0) {
            result = "positive";
        }else if (number < 0){
            result = "negative";
        }else {
            result = "zero";
        }
         */
        String result = number > 0 ? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("------------------");

        int n = 1;

       /* String day = "";

        if(n == 1){
            day = "Monday";
        }else if( n == 2){
            day = "Tuesday";
        }else if( n == 3){
            day = "Wednesday";
        }else if( n == 4){
            day = "Thursday";
        }else if( n == 5){
            day = "Friday";
        }else if( n == 6){
            day = "Saturday";
        }else {
            day = "Sunday";
        }

        System.out.println(day);
*/
        System.out.println("--------------");

        String day = n==1 ? "Monday" : n == 2 ? "Tuesday" : n == 3 ? "Wednesday" : n == 4 ? "Thursday" : n == 5 ? "Friday" : n == 6 ? "Saturday" : "Sunday";

        System.out.println(day);

        int num = 12;

        String month = num == 1 ? "January" : num == 2 ? "February" : num == 3 ? "Wednesday" : num == 4 ? "April" : num == 5 ? "May" : num == 6 ? "June" : num == 7 ? "July" : num == 8 ? "August" : num == 9? "September" : num == 10 ? "October" : num == 11 ? "November" : num == 12? "December" : "Invalid month";

        System.out.println(month);
    }
}
