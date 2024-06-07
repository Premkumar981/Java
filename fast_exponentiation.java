import java.util.Scanner;

class Main {
    // Will run infinitely if a negative
    // N value is given
    public static int power(int a, int n) {
        if(n == 0)
            return 1;
        
        int partial = power(a, n/2);

        if(n % 2 == 0)
            return partial * partial;

        return partial * partial * a;
    }

    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();

        System.out.println(power(A, N));
    }
}