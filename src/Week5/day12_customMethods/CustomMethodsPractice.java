package Week5.day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(767,90);
        initial("vesna","miladinovic");
    }
    public static void maxNum(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num1 < num2){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }
    public static void initial(String firstName, String lastName){
        firstName = firstName.toUpperCase();
        lastName = lastName.toUpperCase();
        System.out.println("initial is: " + firstName.charAt(0) + "." + lastName.charAt(0));
    }
}

