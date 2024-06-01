import java.util.Scanner;

class Main {
    // Will run infinitely if a negative
    // input is given
    public static int fib(int n) {
        if(n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fib(N));
    }
}