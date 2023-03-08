package Week5.day13;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(900);
        System.out.println(multiplication(9,8));
    }
    public static void eligible(int age){
        if(age<0 || age > 150){
            System.err.println("Invalid age: " + age);
            return;
        }
        if(age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }
    public static int multiplication(int n1, int n2){
        return n1*n2;
    }
}
