package Utilities;

public class StringUtility {
    public static String reverse(String str1){
        String reverse = "";
        for(int i = str1.length()-1; i>=0; i--){
            reverse += str1.charAt(i);
        }
        return reverse;
    }

}
