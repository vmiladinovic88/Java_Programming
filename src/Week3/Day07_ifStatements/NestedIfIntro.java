package Week3.Day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 70;

        if(score >=0 && score <=100){
            if (score >=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid score");
        }

        System.out.println("-------------");

        int age =250;

        if(age >=0 && age <=100) {
            if (age >= 21) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        }else {
            System.out.println("Invalid age");
        }

    }
}
