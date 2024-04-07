import java.util.Scanner;

public class Diagonal_printing {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][N];

        // Take input
        for(int i = 0; i < N; ++i)
            for(int j = 0; j < N; ++j)
                arr[i][j] = sc.nextInt();

        // Print the main diagonal
        for(int i = 0; i < N; ++i) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        // Print secondary diagonal
        for(int i = 0, j = N - 1; i < N; ++i, --j) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
