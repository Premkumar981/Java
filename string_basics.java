import java.util.Scanner;

public class string_basics {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        String str1 = "I like rain!";
        String str2 = new String("But I got cold easily :(");

        System.out.println(str1);
        System.out.println(str2);

        // Taking input
        str = sc.next();
        System. out.println(str);
        str2 = sc.nextLine();
        System. out.println(str2);


        String greet = "Hello!";
        String name = "My name is Khan.";
        String intro = greet + " " + name;

        System. out.println(intro);
    }
}
