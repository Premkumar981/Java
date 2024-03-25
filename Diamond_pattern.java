import java.util.Scanner;

public class Diamond_pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num_stars = 1;

        // N rows to be printed
        for(int row = 1; row <= N; ++row) {

            // Print (N - row) space characters
            for(int sp = 1; sp <= N - row; ++sp) {
                System.out.print(" ");
            }

            // Print num_stars number of stars
            for(int st = 1; st <= num_stars; st++) {
                System.out.print("*");
            }

            System.out.println("");

            // increment num_stars by 2.
            num_stars += 2;
        }

        // think about this part
        num_stars = 2*(N-1) - 1;

        for(int row = N - 1; row >= 1; --row) {

            // Print (N - row) space characters
            for(int sp = 1; sp <= N - row; ++sp) {
                System.out.print(" ");
            }

            // Print num_stars number of stars
            for(int st = 1; st <= num_stars; st++) {
                System.out.print("*");
            }

            System.out.println("");

            // decrement num_stars by 2.
            num_stars -= 2;
        }

        sc.close();
    }
}
