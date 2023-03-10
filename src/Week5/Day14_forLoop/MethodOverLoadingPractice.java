package Week5.Day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(6,8,9));
        System.out.println(sum(8,9,0,7));
        System.out.println(sum(5.6,6.7));
        System.out.println(sum(5.6,4.5,3.5));
    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }
    public static int sum(int n1, int n2, int n3){
        return sum(n1,n2)+n3;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        return sum(n1,n2,n3)+n4;
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }
    public static double sum(double num1, double num2, double num3){
        return sum(num1, num2) + num3;
    }
}
