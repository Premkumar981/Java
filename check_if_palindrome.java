import java.util.Scanner;

public class check_if_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i = 0, j = str.length() - 1;

        String ans = "Yes";

        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                ans = "No";
                break;
            }

            // after every iteration
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
