import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
      // you code goes here
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int sum = 0;

      for(int num = N; num > 0; num /= 10) {
        System.out.println("Number is " + num + " now.");
        int lastDigit = num % 10;
        sum += lastDigit;
      }
      System.out.println(sum);

      sc.close();
    }
}
