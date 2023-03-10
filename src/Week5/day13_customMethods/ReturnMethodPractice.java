package Week5.day13_customMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int num = 209;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }
    public static boolean isOdd(int num){
        return  (num % 2 == 0) ?true:false;
    }
    public static boolean isEven(int num){
        return !isOdd(num);
    }
    public static int maxNum(int num1, int num2){
        return (num1>num2)?num1:num2;
    }
}
