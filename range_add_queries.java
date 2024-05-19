import java.util.*;

// Time: O(N + Q)
// Space: O(N)

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and Q
        int N = sc.nextInt();
        int Q = sc.nextInt();

        // An array of all zeroes
        int arr[] = new int[N];

        // Input the queries
        for(int i = 0; i < Q; ++i) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            arr[l] += 1;

            if(r + 1 < N)
                arr[r + 1] -= 1;
        }

        // Converting the same array to
        // prefix sum array. [new learning]
        for(int i = 1; i < N; ++i)
            arr[i] += arr[i-1];

        // Print the ans
        for(int num : arr)
            System.out.print(num + " ");

    }
}