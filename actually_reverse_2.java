import java.util.Scanner;

public class actually_reverse_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Write the code to reverse the array
        for(int i = 0; i < N/2; ++i) {
            int temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = arr[i];
        }


        for(int val : arr)
            System.out.print(val + " ");

        sc.close();
    }
}
