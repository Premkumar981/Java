import java.util.Scanner;

public class fizzbuzz_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      int N = sc.nextInt();

      int sum = 0;

      for(int i = 1; i <= N; i++) {
        if(i%3 == 0 && i%5 == 0)
            System.out.println("FizzBuzz");
        else if(i%5 == 0)
            System.out.println("Buzz");
        else if(i%3 == 0)
            System.out.println("Fizz");
        else {
          System.out.println(i);
          sum += i; // keep adding i to the sum variable.
          if(sum > 3*N)
            break;
        }
    }
      

      sc.close();
    }
}
