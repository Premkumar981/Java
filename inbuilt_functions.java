import java.util.Arrays;

public class inbuilt_functions {
    public static void main (String[] args) {

        String str = "   Hello, I'm coming, Bye!   ";
        System.out.println(str. length());
        System.out.println(str.charAt(3)); // l

        // substring
        System.out.println(str.substring(7, 17));
        System.out.println(str.substring(7));

        // split
        String arr[] = str.split(",");
        System.out.println(Arrays.toString(arr));

        // contains
        System.out.println(str.contains("coming!")); // false
        System.out.println(str.contains("coming")); // true

        // trim
        String str2 = str.trim();
        System.out.println(str);
        System.out.println(str2);
    }
}
