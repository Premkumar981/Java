import java.util.Scanner;

class Main {
    // Will run infinitely if a negative
    // input is given
    public static int factorial(int n) {
        if(n == 0)
            return 1;

        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(factorial(N));
    }
}