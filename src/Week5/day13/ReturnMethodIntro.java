package Week5.day13;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        //int total = sum(20,40); //sum is void method , does not return any data
        int total = sum(10,20);
        System.out.println(total);
        int t = square(5);
        System.out.println(t);
        int r = cube(5);
        System.out.println(r);

    }
    //public static void sum(int n1, int n2){
      //  int result = n1 + n2;
    public static int sum(int n1, int n2){
        int result = n1 + n2;
    return result;
    }
    public static int square(int num){
        int square = num*num;
        return square;
    }
    public static int cube (int n){
        int cube = square(n) * n;
        return cube;

    }
    }

