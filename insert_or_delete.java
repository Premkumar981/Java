import java.util.Scanner;

public class insert_or_delete {
    public static void display(int[] arr, int N) {
        for(int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static int insert_at_end(int[] arr, int N, int val) {
        if(N < arr.length) {
            arr[N] = val;
            return N + 1;
        }
        else return N;
    }

    public static int delete_from_end(int[] arr, int N) {
        if(N >= 1) {
            arr[N - 1] = 0;
            return N - 1;
        }
        else return N;
    }

    public static int delete_from_beginning(int[] arr, int N) {
        if(N == 0)
            return N;

        // N >= 1
        // arr[1] -> arr[0]
        // arr[2] -> arr[1]
        // ....
        // arr[N-1] -> arr[N-2]

        // orig = [3, 1, 5, 2, .....] (N = 4)

        // cur = [1, 5, 2, 2, ......]
        for(int i = 0; i + 1 < N; ++i) {
            arr[i] = arr[i + 1];
        }
        arr[N - 1] = 0;

        return N - 1;
    }

    public static int insert_at_beginning(int[] arr, int N, int val) {
        if(N == arr.length)
            return N;

        // Make space at 0th index
        // Shift everything to 1 place right.

        // Orig = [3, 1, 5, 2, ....] (N = 4)
        for(int i = N; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }

        // Use the space to fill in the new val.
        arr[0] = val;

        return N + 1;
    }

    public static int delete_at_index(int[] arr, int N, int id) {
        if(N == 0)
            return N;
        if(id < 0 || id >= N)
            return N;

        // N >= 1
        // arr[i+1] -> arr[i]
        // arr[i+2] -> arr[i+1]
        // ....
        // arr[N-1] -> arr[N-2]

        for(int i = id; i + 1 < N; ++i) {
            arr[i] = arr[i + 1];
        }
        arr[N - 1] = 0;

        return N - 1;
    }

    public static int insert_at_index(int[] arr, int N, int id, int val) {
        if(N == arr.length)
            return N;

        if(id < 0 || id > N)
            return N;

        // Make space at ith index
        // Shift everything to 1 place right from ith index onwards.

        for(int i = N; i >= id + 1; i--) {
            arr[i] = arr[i - 1];
        }

        // Use the space to fill in the new val.
        arr[id] = val;

        return N + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // you code goes here
        int arr[] = new int[100];

        // Taking the input
        int N = sc.nextInt();
        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

        display(arr, N);

        // Delete from the end.
        N = delete_from_end(arr, N);
        display(arr, N);

        N = insert_at_end(arr, N, 20);
        N = insert_at_end(arr, N, 15);
        display(arr, N);

        // Delete from the beginning.
        N = delete_from_beginning(arr, N);
        display(arr, N);
        N = delete_from_beginning(arr, N);
        display(arr, N);

        // Insert in the beginning.
        N = insert_at_beginning(arr, N, 100);
        display(arr, N);
        N = insert_at_beginning(arr, N, 101);
        display(arr, N);

        // Delete using delete_at_index.
        N = delete_at_index(arr, N, 5);
        display(arr, N);
        N = delete_at_index(arr, N, 1);
        display(arr, N);
        N = delete_at_index(arr, N, 0);
        display(arr, N);
        N = delete_at_index(arr, N, N - 1);
        display(arr, N);

        // Insert at index.
        N = insert_at_index(arr, N, 0, 1);
        display(arr, N);
        N = insert_at_index(arr, N, 1, 2);
        display(arr, N);
        N = insert_at_index(arr, N, 5, 6);
        display(arr, N);
        N = insert_at_index(arr, N, N, 9);
        display(arr, N);

        // Close the scanner
        sc.close();
    }
}
