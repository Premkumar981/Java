import java.util.Scanner;

public class print_all_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();


        // Print all the subarrays
        for(int st = 0; st < N; ++st) {
            // en = st, st+1, st+2 .. N - 1
            for(int en = st; en < N; ++en) {
                // Fixed the st, and fixed the en value
                for(int i = st; i <= en; ++i)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }
}
