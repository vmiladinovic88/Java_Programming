package Week5.Day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for(int i = 10; i>=2; i--){
            System.out.println("Hello Cydeo");
        }
        System.out.println("Hello World");
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello");
    for(char i = 'Z'; i>='A'; i--){
        System.out.print(i + " ");
    }
        System.out.println();
        System.out.println("Cydeo");
    }
}
