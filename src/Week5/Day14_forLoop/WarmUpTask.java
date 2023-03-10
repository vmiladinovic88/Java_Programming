package Week5.Day14_forLoop;

public class WarmUpTask {
    public static void main(String[] args) {
        System.out.println(combine("one", "eight"));
        System.out.println(sumOf2IntegerNumbers(10,20));
        System.out.println(sumOf3IntegerNumbers(10,20,30));
        System.out.println(sumOf4IntegerNumbers(10,20,30,40));

    }
    public static String combine(String str1, String str2){
        String combination;
        if(str1.endsWith("" + str2.charAt(0))){
            combination = str1 + str2.substring(1);
        }else{
            combination = str1 + str2;
        }
        return combination;
    }
    /*
     Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

     */
    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1+n2;
        /*ask 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

            */
    }
    public static int sumOf3IntegerNumbers(int n1,int n2, int n3){
        return sumOf2IntegerNumbers(n1,n2)+ n3;
    }
    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
        //return sumOf3IntegerNumbers(n1,n2,n3)+ n4;
        return sumOf2IntegerNumbers(sumOf2IntegerNumbers(n1,n2),sumOf2IntegerNumbers(n3,n4));
    }

}
