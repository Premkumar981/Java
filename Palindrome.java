import java.util.Scanner;

/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //input from user

        int org_num = num; //store actual value in temp

        //reverse
        int rev = 0;
        
        while (num!=0) {
            rev = rev*10 + num%10;
            num = num/10;
        }
        
        //to check if palindrome or not
        if (org_num == rev) {
            System.out.println("The number " + org_num + " is a Palindrome number");
        }else{
            System.out.println("The number " + org_num + " is not a Palindrome number");
        }
        sc.close();
    }
}