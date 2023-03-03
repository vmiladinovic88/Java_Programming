package Week2.Day06_if_statements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);

        System.out.println( 7 + 3 - 2 / 2);

        System.out.println( -5 + 2);

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                   true == false     "Java" == "Python" || 'a' = 'A'
        //                      false        &&      false        || false
        //                           false || false
        //                               false


        System.out.println( 100 >= 20 && 40 * 2 > 60 );
        //                   100 >= 20 && 80>60
        //                    true && true


    }
}
