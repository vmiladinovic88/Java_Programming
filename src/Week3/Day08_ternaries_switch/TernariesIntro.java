package Week3.Day08_ternaries_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 89;

        String result = "";

        if (score >= 60){
            result = "passed";
        }else{
            result = "failed";
        }

        System.out.println(result);



        String result2 = score >= 60 ?  "passed" :  "failed";
        System.out.println(result2);

        System.out.println("--------------");

        int age = 34;
        String r = "";
/*
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "not eligible";

 */
        String result3 = age >=21 ? "Eligible" : "Not eligible";
        System.out.println(result3);

        }
    }


