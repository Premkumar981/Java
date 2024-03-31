import java.util.*;;

public class print_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Print in reverse order
        for(int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
