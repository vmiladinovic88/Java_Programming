package Week4.Day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Java";
        boolean r1 = word.isEmpty();

        System.out.println(r1);

        String str = "           ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println(r2);
        System.out.println(r3);

        String str1 = "Cydeo";
        String str2 = new String ("Cydeo");

        System.out.println(str1 == str2 );
        System.out.println(str1.equals(str2));

        String str3 = new String ("cydeo");
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));

        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String students = "Hasan Naran Sumeye Natalia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println(hasAhmed);

        String sentence = "My favorite programmin language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);

        String name = "Michael";
        boolean l = name.startsWith("Da");
        System.out.println(l);

        String url = "www.cydeo.com";
        boolean p = url.startsWith("www.");
        System.out.println(p);
        boolean r = url.endsWith(".com");
        System.out.println(r);

        String email = "cydeoschool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        
        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);
    }
}
