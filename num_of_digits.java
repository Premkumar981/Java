import java.util.Scanner;

public class num_of_digits {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int digits = 0;

      for(int num = N; num > 0; num /= 10) {
        System.out.println("Number is " + num + " now.");
        digits++;
      }
      System.out.println(digits);

      sc.close();
    }
}
