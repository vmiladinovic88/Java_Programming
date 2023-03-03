package Week4.Day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "Java programming";

        str1 = str1.toLowerCase();
        System.out.println(str1);

        String str2 = "java programming";
        str2 = str2.toUpperCase();
        System.out.println(str2);

        String word = "Wooden Spoon";
        word = word.toUpperCase();
        System.out.println(word);

        String str4 = "   Cydeo School    ";
        str4 = str4.trim();
        System.out.println(str4);

        String sentence = "Today is Sunday, and we have Java clas";

        int index1 = sentence.indexOf('w');

        System.out.println(index1);

        String s1 = "I love Java Programming";
        int indexA = s1.indexOf('a');
        System.out.println(indexA);

        int secondA = s1.indexOf("a P");
        System.out.println(secondA);

        String st2 = "Java Python JavaScript Cydeo Python";
        int a1 = st2.indexOf('a');
        System.out.println(a1);
        int a2 = st2.indexOf("a Python");
        System.out.println(a2);

        int a3 = st2.indexOf("avaScript");
        System.out.println(a3);

        String w = "Java";

        System.out.println(w.indexOf('a'));

        System.out.println(w.lastIndexOf('a'));
        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));


    }
}
