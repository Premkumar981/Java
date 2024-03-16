import java.util.Scanner;

public class dig_sum_k_1_to_n {
    public static void main(String[] args) {
      // you code goes here
      Scanner sc = new Scanner(System.in);

      int R = sc.nextInt();
      int K = sc.nextInt();
      
      // Iterating over all the values from 1 to R.
      for(int N = 1; N <= R; N++) {

        // Calculating the sum of digits for N
        int sum = 0;
        for(int num = N; num > 0; num /= 10) {
            int lastDigit = num % 10;
            sum += lastDigit;
        }

        if(sum == K)
            System.out.println(N + ": " + sum);
      }

      sc.close();
    }
}
