package Week5.Day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Java";
        String reverse ="";
        for(int i= str.length()-1;i>=0; i--){
           reverse += str.charAt(i);
        }
        System.out.println(reverse);
        String rev = reverse("Vesna");
        System.out.println(rev);

    }
    public static String reverse(String str1){
        String reverse = "";
        for(int i = str1.length()-1; i>=0; i--){
            reverse += str1.charAt(i);
        }
        return reverse;
    }
}
