import java.util.Scanner;

class Main {
    // Will run infinitely if a negative
    // N value is given
    public static int power(int a, int n) {
        if(n == 0)
            return 1;
        
        return power(a, n - 1) * a;
    }

    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();

        System.out.println(power(A, N));
    }
}